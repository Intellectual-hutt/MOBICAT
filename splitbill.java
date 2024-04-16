
public class SplitBill{

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 

		TippyTipperApplication appState = ((TippyTipperApplication)this.getApplication());


		View addperson = findViewById(R.id.addperson);
		btn_addperson.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				
			}
		});

		View removeperson = findViewById(R.id.btn_removeperson);
		btn_removeperson.setOnClickListener(new OnClickListener() 
		{
			public void onClick(View v) 
			{
				
			}
		}

	}


	public void onStart()
	{
		super.onStart();
		
	}


	public void onStop()
	{
		super.onStop();
		
	}

	
	}