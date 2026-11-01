package org.telegram.utils.twidget;

import android.os.Trace;
public final class d0 implements Runnable {
    public final long f44346a;

    @Override
    public final void run() {
        long j10 = this.f44346a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
