package org.telegram.ui;
public final class t60 implements Runnable {
    public final int f49716a;
    public final ly f49717b;

    public t60(ly lyVar, int i3) {
        this.f49716a = i3;
        this.f49717b = lyVar;
    }

    @Override
    public final void run() {
        int i3 = this.f49716a;
        ly lyVar = this.f49717b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.E1;
                try {
                    lyVar.run();
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
        }
    }
}
