package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class g extends CameraCaptureSession.CaptureCallback {
    public final k f62214a;

    public g(k kVar) {
        this.f62214a = kVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        k kVar = this.f62214a;
        o oVar = kVar.f62271j;
        if (cameraCaptureSession == kVar.f62309z) {
            if (kVar.P) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == kVar.T) {
                    kVar.Q++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!kVar.O ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (kVar.O && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        oVar.b("torch result confirmed: enabled=" + kVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + kVar.Q + ", retries=" + kVar.R);
                        kVar.P = false;
                    } else {
                        int i11 = kVar.Q;
                        if (i11 == 3 && (i10 = kVar.R) == 0) {
                            kVar.R = i10 + 1;
                            kVar.Q = 0;
                            oVar.b("torch result not applied; rebuilding request: enabled=" + kVar.O + ", resultMode=" + num + ", flashState=" + num2);
                            kVar.f();
                        } else if (i11 >= 6) {
                            oVar.b("torch result failed: enabled=" + kVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + kVar.R);
                            kVar.P = false;
                        }
                    }
                }
            }
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && l10.longValue() > kVar.W0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (kVar.V0 == 0) {
                    kVar.V0 = l10.longValue();
                    kVar.X0 = 1L;
                } else {
                    long longValue = l10.longValue() - kVar.W0;
                    kVar.Z0++;
                    kVar.f62248a1 += longValue;
                    double d = longValue;
                    kVar.f62251b1 = (d * d) + kVar.f62251b1;
                    long j3 = kVar.f62254c1;
                    if (j3 == 0 || longValue < j3) {
                        kVar.f62254c1 = longValue;
                    }
                    kVar.f62256d1 = Math.max(kVar.f62256d1, longValue);
                    if (longValue > 50000000) {
                        kVar.f62259e1++;
                    }
                    if (longValue > 100000000) {
                        kVar.f62262f1++;
                    }
                    kVar.X0++;
                }
                long j10 = kVar.Y0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    kVar.f62265g1++;
                    kVar.f62267h1 += j11;
                    kVar.f62270i1 = Math.max(kVar.f62270i1, j11);
                }
                kVar.Y0 = elapsedRealtimeNanos;
                kVar.W0 = l10.longValue();
                long longValue2 = l10.longValue() - kVar.V0;
                if (longValue2 >= 3000000000L) {
                    float f10 = (((float) (kVar.X0 - 1)) * 1.0E9f) / ((float) longValue2);
                    p0 p0Var = kVar.I;
                    if (p0Var == null) {
                        i7 = 0;
                    } else {
                        i7 = p0Var.f62371a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f10);
                    sb2.append(", requestedFps=");
                    sb2.append(kVar.h.f62371a);
                    sb2.append(", activeFps=");
                    if (i7 == 0) {
                        valueOf = "unknown";
                    } else {
                        valueOf = Integer.valueOf(i7);
                    }
                    sb2.append(valueOf);
                    sb2.append(", targetMet=");
                    if (i7 != 0 && f10 < i7 * 0.85f) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    sb2.append(z10);
                    sb2.append(", fpsRange=");
                    sb2.append(kVar.J);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(k.i(kVar.f62248a1, kVar.Z0));
                    sb2.append(", min=");
                    sb2.append(((float) kVar.f62254c1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f62256d1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(k.U(kVar.f62251b1, kVar.f62248a1, kVar.Z0));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(kVar.f62259e1);
                    sb2.append(", over100ms=");
                    sb2.append(kVar.f62262f1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(k.i(kVar.f62267h1, kVar.f62265g1));
                    sb2.append(", max=");
                    sb2.append(((float) kVar.f62270i1) / 1000000.0f);
                    sb2.append("}");
                    oVar.b(sb2.toString());
                    kVar.N();
                    kVar.V0 = l10.longValue();
                    kVar.W0 = l10.longValue();
                    kVar.X0 = 1L;
                    kVar.Y0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
