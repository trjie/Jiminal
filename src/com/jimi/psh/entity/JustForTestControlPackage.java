package com.jimi.psh.entity;

import com.jimi.psh.annotation.Parse;
import com.jimi.psh.annotation.Protocol;
import com.jimi.psh.constant.JustForTestClientDevice;
import com.jimi.psh.constant.JustForTestControlledDevice;
import com.jimi.psh.constant.JustForTestLine;
import com.jimi.psh.constant.JustForTestOperation;

@Protocol(0x43)
public class JustForTestControlPackage extends Package {
	
	@Parse({1,1})
	private JustForTestLine justForTestLine;
	@Parse({3,1})
	private JustForTestOperation justForTestOperation;
	@Parse({0,1})
	private JustForTestClientDevice justForTestClientDevice;
	@Parse({2,1})
	private JustForTestControlledDevice justForTestControlledDevice;

	public JustForTestLine getLine() {
		return justForTestLine;
	}

	public void setLine(JustForTestLine justForTestLine) {
		this.justForTestLine = justForTestLine;
	}

	public JustForTestOperation getOperation() {
		return justForTestOperation;
	}

	public void setOperation(JustForTestOperation justForTestOperation) {
		this.justForTestOperation = justForTestOperation;
	}

	public JustForTestClientDevice getClientDevice() {
		return justForTestClientDevice;
	}

	public void setClientDevice(JustForTestClientDevice justForTestClientDevice) {
		this.justForTestClientDevice = justForTestClientDevice;
	}

	public JustForTestControlledDevice getControlledDevice() {
		return justForTestControlledDevice;
	}

	public void setControlledDevice(JustForTestControlledDevice justForTestControlledDevice) {
		this.justForTestControlledDevice = justForTestControlledDevice;
	}

}
