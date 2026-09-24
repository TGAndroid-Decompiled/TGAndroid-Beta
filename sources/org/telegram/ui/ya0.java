package org.telegram.ui;

import java.util.regex.Pattern;
public final class ya0 implements qf.c {
    public final eb0 f40090a;
    public final LaunchActivity f40091b;

    public ya0(LaunchActivity launchActivity) {
        this.f40091b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f40090a = new eb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f40091b.getWindow();
    }

    @Override
    public final void d() {
        this.f40090a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f40091b;
        launchActivity.getClass();
        this.f40090a.a(true);
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
