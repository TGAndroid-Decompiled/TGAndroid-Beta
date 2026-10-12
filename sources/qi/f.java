package qi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
public final class f extends CameraCaptureSession.CaptureCallback {
    public final h f46698a;

    public f(h hVar) {
        this.f46698a = hVar;
    }

    @Override
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        Object valueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        h hVar = this.f46698a;
        l lVar = hVar.f46733j;
        if (hVar.N) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hVar.R) {
                hVar.O++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                if (!hVar.M ? num == null || num.intValue() == 0 : num != null && num.intValue() == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (hVar.M && num2 != null && num2.intValue() != 3 && num2.intValue() != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z11 && z12) {
                    lVar.b("torch result confirmed: enabled=" + hVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + hVar.O + ", retries=" + hVar.P);
                    hVar.N = false;
                } else {
                    int i12 = hVar.O;
                    if (i12 == 3 && (i11 = hVar.P) == 0) {
                        hVar.P = i11 + 1;
                        hVar.O = 0;
                        lVar.b("torch result not applied; rebuilding request: enabled=" + hVar.M + ", resultMode=" + num + ", flashState=" + num2);
                        hVar.a();
                    } else if (i12 >= 6) {
                        lVar.b("torch result failed: enabled=" + hVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + hVar.P);
                        hVar.N = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null && l4.longValue() > hVar.f46764z0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (hVar.f46762y0 == 0) {
                hVar.f46762y0 = l4.longValue();
                hVar.A0 = 1L;
            } else {
                long longValue = l4.longValue() - hVar.f46764z0;
                hVar.C0++;
                hVar.D0 += longValue;
                double d = longValue;
                hVar.E0 = (d * d) + hVar.E0;
                long j3 = hVar.F0;
                if (j3 == 0 || longValue < j3) {
                    hVar.F0 = longValue;
                }
                hVar.G0 = Math.max(hVar.G0, longValue);
                if (longValue > 50000000) {
                    hVar.H0++;
                }
                if (longValue > 100000000) {
                    hVar.I0++;
                }
                hVar.A0++;
            }
            long j10 = hVar.B0;
            if (j10 != 0) {
                long j11 = elapsedRealtimeNanos - j10;
                hVar.J0++;
                hVar.K0 += j11;
                hVar.L0 = Math.max(hVar.L0, j11);
            }
            hVar.B0 = elapsedRealtimeNanos;
            hVar.f46764z0 = l4.longValue();
            long longValue2 = l4.longValue() - hVar.f46762y0;
            if (longValue2 >= 3000000000L) {
                float f7 = (((float) (hVar.A0 - 1)) * 1.0E9f) / ((float) longValue2);
                k0 k0Var = hVar.G;
                if (k0Var == null) {
                    i10 = 0;
                } else {
                    i10 = k0Var.f46803a;
                }
                StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
                sb2.append(f7);
                sb2.append(", requestedFps=");
                sb2.append(hVar.h.f46803a);
                sb2.append(", activeFps=");
                if (i10 == 0) {
                    valueOf = "unknown";
                } else {
                    valueOf = Integer.valueOf(i10);
                }
                sb2.append(valueOf);
                sb2.append(", targetMet=");
                if (i10 != 0 && f7 < i10 * 0.85f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sb2.append(z10);
                sb2.append(", fpsRange=");
                sb2.append(hVar.H);
                sb2.append(", sensorIntervalMs={avg=");
                sb2.append(h.c(hVar.D0, hVar.C0));
                sb2.append(", min=");
                sb2.append(((float) hVar.F0) / 1000000.0f);
                sb2.append(", max=");
                sb2.append(((float) hVar.G0) / 1000000.0f);
                sb2.append(", jitter=");
                sb2.append(h.B(hVar.E0, hVar.D0, hVar.C0));
                sb2.append("}, sensorGaps={over50ms=");
                sb2.append(hVar.H0);
                sb2.append(", over100ms=");
                sb2.append(hVar.I0);
                sb2.append("}, callbackIntervalMs={avg=");
                sb2.append(h.c(hVar.K0, hVar.J0));
                sb2.append(", max=");
                sb2.append(((float) hVar.L0) / 1000000.0f);
                sb2.append("}");
                lVar.b(sb2.toString());
                hVar.u();
                hVar.f46762y0 = l4.longValue();
                hVar.f46764z0 = l4.longValue();
                hVar.A0 = 1L;
                hVar.B0 = elapsedRealtimeNanos;
            }
        }
    }
}
