package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final j f57850a;

    public g(j jVar) {
        this.f57850a = jVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
        Object valueOf;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        j jVar = this.f57850a;
        n nVar = jVar.f57901j;
        if (cameraCaptureSession == jVar.A) {
            if (jVar.Q) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == jVar.U) {
                    jVar.R++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!jVar.P ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (jVar.P && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        nVar.b("torch result confirmed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + jVar.R + ", retries=" + jVar.S);
                        jVar.Q = false;
                    } else {
                        int i11 = jVar.R;
                        if (i11 == 3 && (i10 = jVar.S) == 0) {
                            jVar.S = i10 + 1;
                            jVar.R = 0;
                            nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2);
                            jVar.g();
                        } else if (i11 >= 6) {
                            nVar.b("torch result failed: enabled=" + jVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.S);
                            jVar.Q = false;
                        }
                    }
                }
            }
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && l10.longValue() > jVar.Z0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (jVar.Y0 == 0) {
                    jVar.Y0 = l10.longValue();
                    jVar.f57878a1 = 1L;
                } else {
                    long longValue = l10.longValue() - jVar.Z0;
                    jVar.f57884c1++;
                    jVar.f57886d1 += longValue;
                    double d = longValue;
                    jVar.f57889e1 = (d * d) + jVar.f57889e1;
                    long j3 = jVar.f57892f1;
                    if (j3 == 0 || longValue < j3) {
                        jVar.f57892f1 = longValue;
                    }
                    jVar.f57895g1 = Math.max(jVar.f57895g1, longValue);
                    if (longValue > 50000000) {
                        jVar.f57897h1++;
                    }
                    if (longValue > 100000000) {
                        jVar.f57900i1++;
                    }
                    jVar.f57878a1++;
                }
                long j10 = jVar.f57881b1;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    jVar.f57903j1++;
                    jVar.f57906k1 += j11;
                    jVar.l1 = Math.max(jVar.l1, j11);
                }
                jVar.f57881b1 = elapsedRealtimeNanos;
                jVar.Z0 = l10.longValue();
                long longValue2 = l10.longValue() - jVar.Y0;
                if (longValue2 >= 3000000000L) {
                    float f10 = (((float) (jVar.f57878a1 - 1)) * 1.0E9f) / ((float) longValue2);
                    o0 o0Var = jVar.J;
                    if (o0Var == null) {
                        i7 = 0;
                    } else {
                        i7 = o0Var.f58003a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f10);
                    sb2.append(", requestedFps=");
                    sb2.append(jVar.h.f58003a);
                    sb2.append(", activeFps=");
                    if (i7 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i7);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i7 != 0 && f10 < i7 * 0.85f) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    sb2.append(z9);
                    sb2.append(", fpsRange=");
                    sb2.append(jVar.K);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(j.j(jVar.f57886d1, jVar.f57884c1));
                    sb2.append(", min=");
                    sb2.append(((float) jVar.f57892f1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) jVar.f57895g1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(j.W(jVar.f57889e1, jVar.f57886d1, jVar.f57884c1));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(jVar.f57897h1);
                    sb2.append(", over100ms=");
                    sb2.append(jVar.f57900i1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(j.j(jVar.f57906k1, jVar.f57903j1));
                    sb2.append(", max=");
                    sb2.append(((float) jVar.l1) / 1000000.0f);
                    sb2.append("}");
                    nVar.b(sb2.toString());
                    jVar.O();
                    jVar.Y0 = l10.longValue();
                    jVar.Z0 = l10.longValue();
                    jVar.f57878a1 = 1L;
                    jVar.f57881b1 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
