package org.telegram.utils.twidget;

import android.os.Trace;
public final class a0 implements Runnable {
    public final long f52745a;

    @Override
    public final void run() {
        long j3 = this.f52745a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j3);
        } finally {
            Trace.endSection();
        }
    }
}
