package org.webrtc;

import org.webrtc.NativeLifecycleLock;
public class DtmfSender {
    private final NativeLifecycleLock lifecycleLock;

    public interface Natives {
        boolean canInsertDtmf(long j);

        int duration(long j);

        boolean insertDtmf(long j, String str, int i, int i2);

        int interToneGap(long j);

        String tones(long j);
    }

    public DtmfSender(long j) {
        this.lifecycleLock = new NativeLifecycleLock("DtmfSender", j);
    }

    public static Boolean lambda$canInsertDtmf$0(long j) {
        return Boolean.valueOf(DtmfSenderJni.get().canInsertDtmf(j));
    }

    public static Integer lambda$duration$3(long j) {
        return Integer.valueOf(DtmfSenderJni.get().duration(j));
    }

    public static Boolean lambda$insertDtmf$1(String str, int i, int i2, long j) {
        return Boolean.valueOf(DtmfSenderJni.get().insertDtmf(j, str, i, i2));
    }

    public static Integer lambda$interToneGap$4(long j) {
        return Integer.valueOf(DtmfSenderJni.get().interToneGap(j));
    }

    public static String lambda$tones$2(long j) {
        return DtmfSenderJni.get().tones(j);
    }

    public boolean canInsertDtmf() {
        return ((Boolean) this.lifecycleLock.call(new da3((byte) 25))).booleanValue();
    }

    public void dispose() {
        this.lifecycleLock.dispose(new da3((byte) 28));
    }

    public int duration() {
        return ((Integer) this.lifecycleLock.call(new da3((byte) 27))).intValue();
    }

    public boolean insertDtmf(String str, int i, int i2) {
        return ((Boolean) this.lifecycleLock.call((NativeLifecycleLock.NativePointerCallable<Object>) new wr3(i, i2, str))).booleanValue();
    }

    public int interToneGap() {
        return ((Integer) this.lifecycleLock.call(new da3((byte) 29))).intValue();
    }

    public String tones() {
        return (String) this.lifecycleLock.call(new da3((byte) 26));
    }
}
