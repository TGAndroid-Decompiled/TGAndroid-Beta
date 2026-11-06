package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xy0 extends org.telegram.ui.ActionBar.f2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f52015a;
    public org.telegram.ui.Components.pj0 f52016b;
    public org.telegram.ui.Components.oj0 f52017c;

    public xy0(int i7, Bundle bundle) {
        super(bundle);
        this.f52015a = i7;
    }

    public static void Z(xy0 xy0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.f58762b;
            boolean z9 = !MediaController.s0(xy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58754c = true;
                aVar.f58753b = true;
                xi.d.f58760a.edit().putBoolean("audio_recorder_v2_enabled", z9).apply();
            }
            ((l4) xy0Var.f52017c).f();
        } else if (MediaController.s0(xy0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xy0Var.getParentActivity());
            alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131753921, null), org.telegram.messenger.hd.M0(2131753920, null)}, new k4(xy0Var, 0));
            xy0Var.showDialog(alertDialog$Builder.f27293a);
        }
    }

    public static void a0(xy0 xy0Var, int i7) {
        if (i7 == 1) {
            xi.a aVar = xi.e.d;
            boolean z9 = !org.telegram.ui.Components.t40.d(xy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z9;
                aVar.f58754c = true;
                aVar.f58753b = true;
                xi.d.f58760a.edit().putBoolean("round_video_camera2_enabled", z9).apply();
            }
            ((l4) xy0Var.f52017c).f();
        } else if (org.telegram.ui.Components.t40.d(xy0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                xy0Var.g0(2131745987, new CharSequence[]{"480p", "360p"}, new go0(6));
            } else if (i7 == 3) {
                xy0Var.g0(2131745997, new CharSequence[]{org.telegram.messenger.hd.M0(2131745996, null), org.telegram.messenger.hd.M0(2131745994, null), org.telegram.messenger.hd.M0(2131745995, null)}, new go0(7));
            } else if (i7 == 4) {
                xy0Var.g0(2131745990, new CharSequence[]{"30 FPS", "60 FPS"}, new go0(8));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        xy0Var.g0(2131745998, charSequenceArr, new go0(9));
                        return;
                    }
                }
            } else if (i7 == 8) {
                xi.a aVar2 = xi.e.f58767i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) xy0Var.f52017c).g(i7);
            }
        }
    }

    public static String f0(int i7) {
        if (i7 % 1000000 == 0) {
            return (i7 / 1000000) + " Mbps";
        } else if (i7 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i7 / 1000000.0f));
        } else {
            return (i7 / 1000) + " kbps";
        }
    }

    @Override
    public final View createView(Context context) {
        switch (this.f52015a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745986, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 7));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
                this.f52016b = pj0Var;
                pj0Var.r1();
                this.f52016b.setSectionsDrawBackground(true);
                this.f52016b.setLayoutManager(new v4.b0());
                this.f52016b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var2 = this.f52016b;
                l4 l4Var = new l4(17, this, context);
                this.f52017c = l4Var;
                pj0Var2.setAdapter(l4Var);
                this.f52016b.setOnItemClickListener(new vx0(this, 2));
                frameLayout.addView(this.f52016b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 23));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.pj0 pj0Var3 = new org.telegram.ui.Components.pj0(context, null);
                this.f52016b = pj0Var3;
                pj0Var3.setSectionsDrawBackground(true);
                this.f52016b.r1();
                this.f52016b.setLayoutManager(new v4.b0());
                this.f52016b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.pj0 pj0Var4 = this.f52016b;
                l4 l4Var2 = new l4(0, this, context);
                this.f52017c = l4Var2;
                pj0Var4.setAdapter(l4Var2);
                this.f52016b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f52016b, c8.ha.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, go0 go0Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f27293a.R = org.telegram.messenger.hd.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, go0Var));
        showDialog(alertDialog$Builder.f27293a);
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        switch (this.f52015a) {
            case 0:
                return this.f52016b;
            default:
                return this.f52016b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f52015a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f52015a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
