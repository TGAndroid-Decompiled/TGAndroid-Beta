package org.telegram.ui;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
public final class z90 {
    public final int f43853a;
    public boolean f43854b;
    public boolean f43855c;
    public final Object d;

    public z90(Object obj, int i10) {
        this.f43853a = i10;
        this.d = obj;
    }

    public void a() {
        if (!this.f43854b) {
            this.f43854b = true;
            Runnable runnable = (Runnable) this.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void b() {
        switch (this.f43853a) {
            case 0:
                c(false);
                this.f43855c = true;
                return;
            default:
                c(false);
                this.f43855c = true;
                return;
        }
    }

    public void c(boolean z10) {
        int i10;
        int i11;
        switch (this.f43853a) {
            case 0:
                if (this.f43854b != z10 && !this.f43855c) {
                    this.f43854b = z10;
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
                        l0 l0Var = launchActivity.f33396w0;
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
                c5.e eVar = (c5.e) this.d;
                if (this.f43854b != z10 && !this.f43855c) {
                    this.f43854b = z10;
                    boolean z11 = true;
                    if (z10) {
                        eVar.f3775a++;
                    } else {
                        eVar.f3775a--;
                    }
                    int i14 = 0;
                    if (eVar.f3775a <= 0) {
                        z11 = false;
                    }
                    if (eVar.f3776b != z11) {
                        eVar.f3776b = z11;
                        Window window = (Window) ((WeakReference) ((mg.l) eVar.f3777c).f13183b).get();
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

    public z90(LaunchActivity launchActivity, boolean z10) {
        this.f43853a = 0;
        this.d = new WeakReference(launchActivity);
    }
}
