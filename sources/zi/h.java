package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class h extends CameraCaptureSession.CaptureCallback {
    public final l f61522a;

    public h(l lVar) {
        this.f61522a = lVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i7;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        l lVar = this.f61522a;
        p pVar = lVar.f61579j;
        if (cameraCaptureSession == lVar.f61617z) {
            if (lVar.P) {
                Object tag = captureRequest.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == lVar.T) {
                    lVar.Q++;
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                    Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                    if (!lVar.O ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (lVar.O && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z11 && z12) {
                        pVar.b("torch result confirmed: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + lVar.Q + ", retries=" + lVar.R);
                        lVar.P = false;
                    } else {
                        int i11 = lVar.Q;
                        if (i11 == 3 && (i10 = lVar.R) == 0) {
                            lVar.R = i10 + 1;
                            lVar.Q = 0;
                            pVar.b("torch result not applied; rebuilding request: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2);
                            lVar.f();
                        } else if (i11 >= 6) {
                            pVar.b("torch result failed: enabled=" + lVar.O + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + lVar.R);
                            lVar.P = false;
                        }
                    }
                }
            }
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && l10.longValue() > lVar.W0) {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                if (lVar.V0 == 0) {
                    lVar.V0 = l10.longValue();
                    lVar.X0 = 1L;
                } else {
                    long longValue = l10.longValue() - lVar.W0;
                    lVar.Z0++;
                    lVar.f61556a1 += longValue;
                    double d = longValue;
                    lVar.f61559b1 = (d * d) + lVar.f61559b1;
                    long j3 = lVar.f61562c1;
                    if (j3 == 0 || longValue < j3) {
                        lVar.f61562c1 = longValue;
                    }
                    lVar.f61564d1 = Math.max(lVar.f61564d1, longValue);
                    if (longValue > 50000000) {
                        lVar.f61567e1++;
                    }
                    if (longValue > 100000000) {
                        lVar.f61570f1++;
                    }
                    lVar.X0++;
                }
                long j10 = lVar.Y0;
                if (j10 != 0) {
                    long j11 = elapsedRealtimeNanos - j10;
                    lVar.f61573g1++;
                    lVar.f61575h1 += j11;
                    lVar.f61578i1 = Math.max(lVar.f61578i1, j11);
                }
                lVar.Y0 = elapsedRealtimeNanos;
                lVar.W0 = l10.longValue();
                long longValue2 = l10.longValue() - lVar.V0;
                if (longValue2 >= 3000000000L) {
                    float f10 = (((float) (lVar.X0 - 1)) * 1.0E9f) / ((float) longValue2);
                    q0 q0Var = lVar.I;
                    if (q0Var == null) {
                        i7 = 0;
                    } else {
                        i7 = q0Var.f61676a;
                    }
                    StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                    sb2.append(f10);
                    sb2.append(", requestedFps=");
                    sb2.append(lVar.h.f61676a);
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
                    sb2.append(lVar.J);
                    sb2.append(", sensorIntervalMs={avg=");
                    sb2.append(l.i(lVar.f61556a1, lVar.Z0));
                    sb2.append(", min=");
                    sb2.append(((float) lVar.f61562c1) / 1000000.0f);
                    sb2.append(", max=");
                    sb2.append(((float) lVar.f61564d1) / 1000000.0f);
                    sb2.append(", jitter=");
                    sb2.append(l.U(lVar.f61559b1, lVar.f61556a1, lVar.Z0));
                    sb2.append("}, sensorGaps={over50ms=");
                    sb2.append(lVar.f61567e1);
                    sb2.append(", over100ms=");
                    sb2.append(lVar.f61570f1);
                    sb2.append("}, callbackIntervalMs={avg=");
                    sb2.append(l.i(lVar.f61575h1, lVar.f61573g1));
                    sb2.append(", max=");
                    sb2.append(((float) lVar.f61578i1) / 1000000.0f);
                    sb2.append("}");
                    pVar.b(sb2.toString());
                    lVar.N();
                    lVar.V0 = l10.longValue();
                    lVar.W0 = l10.longValue();
                    lVar.X0 = 1L;
                    lVar.Y0 = elapsedRealtimeNanos;
                }
            }
        }
    }
}
