package media.pane;

import javax.swing.JLabel;

import com.oms.bean.Media;

import abstractdata.ADataSinglePane;

@SuppressWarnings("serial")
public class MediaSinglePane extends ADataSinglePane<Media>{
	private JLabel labelTitle;
	private JLabel labelCagegory;
	private JLabel labelCost;
	
	public MediaSinglePane() {
		super();
	}
		
	
	public MediaSinglePane(Media media) {
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
		labelTitle = new JLabel();
		add(labelTitle, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelCagegory = new JLabel();
		add(labelCagegory, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelCost = new JLabel();
		add(labelCost, c);
	}
	
	
	@Override
	public void displayData() {
		labelTitle.setText("Huy.VQ173170 - Title: " + t.getTitle());
		labelCagegory.setText("Huy.VQ173170 - Category: " + t.getCategory());
		labelCost.setText("Huy.VQ173170 - Cost: " + t.getCost() + "");
	}
}
