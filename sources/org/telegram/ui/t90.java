package org.telegram.ui;

import java.util.regex.Pattern;
public final class t90 implements kf.b {
    public final z90 f41586a;
    public final LaunchActivity f41587b;

    public t90(LaunchActivity launchActivity) {
        this.f41587b = launchActivity;
        Pattern pattern = LaunchActivity.D1;
        this.f41586a = new z90(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.D1;
        this.f41587b.getWindow();
    }

    @Override
    public final void d() {
        this.f41586a.c(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.D1;
        LaunchActivity launchActivity = this.f41587b;
        launchActivity.getClass();
        this.f41586a.c(true);
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
