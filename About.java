
public class About{
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
		TextView AboutDetails = (TextView)findViewById(R.id.AboutDetails);
		TextView VersionNumber = (TextView)findViewById(R.id.VersionNumber);
		
		Button BuyDonateVersion = (Button)findViewById(R.id.BuyDonateVersion);
		BuyDonateVersion.setOnClickListener(new OnClickListener()
		{
			
		
			public void onClick(View v)
			{
				
			}
		}
		
	
		Button Visit = (Button)findViewById(R.id.Visit);
		Visit.setOnClickListener(new OnClickListener()
		{
			
			
			public void onClick(View v)
			{
				
				
			}
		})
		
	
    
  
	public void onStart()
    {
       super.onStart();
      
    }
    
  
	public void onStop()
    {
       super.onStop();
      
    }
}
