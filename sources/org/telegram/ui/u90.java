package org.telegram.ui;

import java.util.regex.Pattern;
public final class u90 implements kf.b {
    public final aa0 f42093a;
    public final LaunchActivity f42094b;

    public u90(LaunchActivity launchActivity) {
        this.f42094b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.f42093a = new aa0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.f42094b.getWindow();
    }

    @Override
    public final void d() {
        this.f42093a.c(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.f42094b;
        launchActivity.getClass();
        this.f42093a.c(true);
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
