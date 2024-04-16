public class Total {
	
	WebView View;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());
        calculateTip(appState.service.getTipPercentageAsDouble());
        
        View SplitBill = findViewById(R.id.SplitBill);
        SplitBill.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		
            	}
            });
		
        View rounddown = findViewById(R.id.round_down);
        rounddown.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		
            	}
            });
        
        View roundup = findViewById(R.id.round_up);
        roundup.setOnClickListener(new OnClickListener() 
        	{
            	public void onClick(View v) 
            	{
            		
            	}
       
		
		SeekBar percentage = (SeekBar)findViewById(R.id.percentage);
		seek_tip_percentage.setOnSeekBarChangeListener(new OnSeekBarChangeListener()
			{	
				
				public void onProgressChanged()
				{
					
				}

				
			
		
		
    }	
		Button TipAmount1 = (Button)findViewById(R.id.TipAmount1);
       
        TipAmount1.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		
        	}
        });
        
        Button TipAmount2 = (Button)findViewById(R.id.btn_TipAmount2);
        TipAmount2.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		
        	}
        });
        
        Button TipAmount3 = (Button)findViewById(R.id.btn_TipAmount3);
       
        TipAmount3.setOnClickListener(new OnClickListener() 
    	{
        	public void onClick(View v) 
        	{
        		
        	}
        });
	}
	
	
	public void onStop()
    {
       
    }
    
     
  
	protected void onResume()
	{
		

		}
    
	protected void onPause()
	{
		
	}


}