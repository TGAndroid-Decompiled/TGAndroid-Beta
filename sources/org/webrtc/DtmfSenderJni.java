package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.DtmfSender;
public class DtmfSenderJni implements DtmfSender.Natives {
    private static JniTestInstanceHolder sOverride;

    public static DtmfSender.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (DtmfSender.Natives) obj;
        }
        return new DtmfSenderJni();
    }

    public static void setInstanceForTesting(DtmfSender.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public boolean canInsertDtmf(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_canInsertDtmf(j);
    }

    @Override
    public int duration(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_duration(j);
    }

    @Override
    public boolean insertDtmf(long j, String str, int i, int i2) {
        return GEN_JNI.org_webrtc_DtmfSender_insertDtmf(j, str, i, i2);
    }

    @Override
    public int interToneGap(long j) {
        return GEN_JNI.org_webrtc_DtmfSender_interToneGap(j);
    }

    @Override
    public String tones(long j) {
        return (String) GEN_JNI.org_webrtc_DtmfSender_tones(j);
    }
}
