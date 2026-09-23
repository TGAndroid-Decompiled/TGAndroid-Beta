package org.telegram.ui;

import java.util.regex.Pattern;
public final class za0 implements qf.c {
    public final fb0 f40094a;
    public final LaunchActivity f40095b;

    public za0(LaunchActivity launchActivity) {
        this.f40095b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f40094a = new fb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f40095b.getWindow();
    }

    @Override
    public final void d() {
        this.f40094a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f40095b;
        launchActivity.getClass();
        this.f40094a.a(true);
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
