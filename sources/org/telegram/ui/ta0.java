package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class ta0 implements zf.k0 {
    public final int f41980a;
    public boolean f41981b;
    public boolean f41982c;
    public final Object d;

    public ta0(Object obj, int i10) {
        this.f41980a = i10;
        this.d = obj;
    }

    @Override
    public void a(boolean z10) {
        int i10;
        int i11;
        switch (this.f41980a) {
            case 0:
                if (this.f41981b != z10 && !this.f41982c) {
                    this.f41981b = z10;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) this.d).get();
                    if (launchActivity != null) {
                        int i12 = launchActivity.C1;
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        int i13 = i12 + i10;
                        launchActivity.C1 = i13;
                        l0 l0Var = launchActivity.f33501w0;
                        if (l0Var != null) {
                            if (i13 > 0) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            l0Var.setVisibility(i11);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                zf.l0 l0Var2 = (zf.l0) this.d;
                if (this.f41981b != z10 && !this.f41982c) {
                    this.f41981b = z10;
                    boolean z11 = true;
                    if (z10) {
                        l0Var2.f52051a++;
                    } else {
                        l0Var2.f52051a--;
                    }
                    int i14 = 0;
                    if (l0Var2.f52051a <= 0) {
                        z11 = false;
                    }
                    if (l0Var2.f52052b != z11) {
                        l0Var2.f52052b = z11;
                        Window window = (Window) ((WeakReference) l0Var2.f52053c.f50940b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (z11) {
                                i14 = 8;
                            }
                            decorView.setVisibility(i14);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b() {
        if (!this.f41981b) {
            this.f41981b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override
    public void destroy() {
        switch (this.f41980a) {
            case 0:
                a(false);
                this.f41982c = true;
                return;
            default:
                a(false);
                this.f41982c = true;
                return;
        }
    }

    public ta0(LaunchActivity launchActivity, boolean z10) {
        this.f41980a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
