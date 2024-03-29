package media.physical;

import javax.swing.JLabel;

import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;
import media.pane.MediaSinglePane;

@SuppressWarnings("serial")
public class PhysicalMediaSinglePane extends MediaSinglePane {
	private JLabel labelBarcode;
	private JLabel labelDescription;
	private JLabel labelQuantity;
	private JLabel labelWeight;
	private JLabel labelDimension;
	
	public PhysicalMediaSinglePane() {
		super();
	}
	
	public PhysicalMediaSinglePane(Media media) {
		this();
		this.t = media;
		
		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelBarcode = new JLabel();
		add(labelBarcode, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDescription = new JLabel();
		add(labelDescription, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelQuantity = new JLabel();
		add(labelQuantity, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelWeight = new JLabel();
		add(labelWeight, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDimension = new JLabel();
		add(labelDimension, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof PhysicalMedia) {
			PhysicalMedia pMedia = (PhysicalMedia) t;
			labelBarcode.setText("Huy.VQ173170 - Barcode: " + pMedia.getBarcode());
			labelDescription.setText("Huy.VQ173170 - Description: " + pMedia.getDescription());
			labelQuantity.setText("Huy.VQ173170 - Quantity: " + pMedia.getQuantity());
			labelWeight.setText("Huy.VQ173170 - Weight: " + pMedia.getWeight());
			labelDimension.setText("Huy.VQ173170 - Dimension: " + pMedia.getDimension());
		}
	}
}
