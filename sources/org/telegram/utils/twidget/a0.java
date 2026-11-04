package org.telegram.utils.twidget;

import android.os.Trace;
public final class a0 implements Runnable {
    public final long f52810a;

    @Override
    public final void run() {
        long j10 = this.f52810a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
