package org.telegram.ui;

import java.util.regex.Pattern;
public final class ya0 implements qf.c {
    public final eb0 f40104a;
    public final LaunchActivity f40105b;

    public ya0(LaunchActivity launchActivity) {
        this.f40105b = launchActivity;
        Pattern pattern = LaunchActivity.B1;
        this.f40104a = new eb0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.B1;
        this.f40105b.getWindow();
    }

    @Override
    public final void d() {
        this.f40104a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.B1;
        LaunchActivity launchActivity = this.f40105b;
        launchActivity.getClass();
        this.f40104a.a(true);
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
