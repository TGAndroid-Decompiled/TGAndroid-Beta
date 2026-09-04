package org.webrtc;
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long j3) {
        this.nativeDtmfSender = j3;
    }

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender != 0) {
            return;
        }
        throw new IllegalStateException("DtmfSender has been disposed.");
    }

    private static native boolean nativeCanInsertDtmf(long j3);

    private static native int nativeDuration(long j3);

    private static native boolean nativeInsertDtmf(long j3, String str, int i10, int i11);

    private static native int nativeInterToneGap(long j3);

    private static native String nativeTones(long j3);

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(String str, int i10, int i11) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i10, i11);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}
