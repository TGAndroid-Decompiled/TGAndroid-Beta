package org.telegram.ui;

import java.util.regex.Pattern;
public final class wa0 implements cf.c {
    public final kf.t0 f39326a;
    public final LaunchActivity f39327b;

    public wa0(LaunchActivity launchActivity) {
        this.f39327b = launchActivity;
        Pattern pattern = LaunchActivity.f31586y1;
        this.f39326a = new kf.t0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f31586y1;
        this.f39327b.getWindow();
    }

    @Override
    public final void d() {
        this.f39326a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f31586y1;
        LaunchActivity launchActivity = this.f39327b;
        launchActivity.getClass();
        this.f39326a.a(true);
        launchActivity.getWindow();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void e() {
    }
}
