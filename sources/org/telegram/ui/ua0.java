package org.telegram.ui;

import java.util.regex.Pattern;
public final class ua0 implements df.c {
    public final lf.s0 f38893a;
    public final LaunchActivity f38894b;

    public ua0(LaunchActivity launchActivity) {
        this.f38894b = launchActivity;
        Pattern pattern = LaunchActivity.f31612y1;
        this.f38893a = new lf.s0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f31612y1;
        this.f38894b.getWindow();
    }

    @Override
    public final void d() {
        this.f38893a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f31612y1;
        LaunchActivity launchActivity = this.f38894b;
        launchActivity.getClass();
        this.f38893a.a(true);
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
