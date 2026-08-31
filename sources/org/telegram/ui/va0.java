package org.telegram.ui;

import java.util.regex.Pattern;
public final class va0 implements df.c {
    public final lf.s0 f42190a;
    public final LaunchActivity f42191b;

    public va0(LaunchActivity launchActivity) {
        this.f42191b = launchActivity;
        Pattern pattern = LaunchActivity.f34134y1;
        this.f42190a = new lf.s0(launchActivity, false);
    }

    @Override
    public final void b() {
        Pattern pattern = LaunchActivity.f34134y1;
        this.f42191b.getWindow();
    }

    @Override
    public final void d() {
        this.f42190a.a(false);
    }

    @Override
    public final void f() {
        Pattern pattern = LaunchActivity.f34134y1;
        LaunchActivity launchActivity = this.f42191b;
        launchActivity.getClass();
        this.f42190a.a(true);
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
