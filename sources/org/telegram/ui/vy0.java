package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vy0 extends org.telegram.ui.ActionBar.e2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f52326a;
    public org.telegram.ui.Components.uj0 f52327b;
    public org.telegram.ui.Components.tj0 f52328c;

    public vy0(int i7, Bundle bundle) {
        super(bundle);
        this.f52326a = i7;
    }

    public static void Z(vy0 vy0Var, int i7) {
        if (i7 == 5) {
            org.telegram.messenger.np.e1().edit().putBoolean("design_voice_live_transcript", !c8.z0.b()).apply();
            ((l4) vy0Var.f52328c).g(5);
            ((l4) vy0Var.f52328c).g(6);
        } else if (i7 == 6) {
            if (c8.z0.b()) {
                org.telegram.messenger.np.e1().edit().putBoolean("design_voice_live_field", !c8.z0.c()).apply();
                ((l4) vy0Var.f52328c).g(6);
                ((l4) vy0Var.f52328c).g(7);
            }
        } else if (i7 == 1) {
            aj.a aVar = aj.e.f1658b;
            boolean z10 = !MediaController.s0(vy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1650c = true;
                aVar.f1649b = true;
                aj.d.f1656a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            ((l4) vy0Var.f52328c).f();
        } else if (MediaController.s0(vy0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vy0Var.getParentActivity());
            alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131753922, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.hd.M0(2131753921, null), org.telegram.messenger.hd.M0(2131753920, null)}, new k4(vy0Var, 0));
            vy0Var.showDialog(alertDialog$Builder.f28392a);
        }
    }

    public static void a0(vy0 vy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.d;
            boolean z10 = !org.telegram.ui.Components.w40.e(vy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1650c = true;
                aVar.f1649b = true;
                aj.d.f1656a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((l4) vy0Var.f52328c).f();
        } else if (org.telegram.ui.Components.w40.e(vy0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                vy0Var.g0(2131745986, new CharSequence[]{"480p", "360p"}, new t70(12));
            } else if (i7 == 3) {
                vy0Var.g0(2131745996, new CharSequence[]{org.telegram.messenger.hd.M0(2131745995, null), org.telegram.messenger.hd.M0(2131745993, null), org.telegram.messenger.hd.M0(2131745994, null)}, new t70(13));
            } else if (i7 == 4) {
                vy0Var.g0(2131745989, new CharSequence[]{"30 FPS", "60 FPS"}, new t70(14));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        vy0Var.g0(2131745997, charSequenceArr, new t70(15));
                        return;
                    }
                }
            } else if (i7 == 8) {
                aj.a aVar2 = aj.e.f1663i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) vy0Var.f52328c).g(i7);
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
        switch (this.f52326a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131745985, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 8));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
                this.f52327b = uj0Var;
                uj0Var.r1();
                this.f52327b.setSectionsDrawBackground(true);
                this.f52327b.setLayoutManager(new v4.b0());
                this.f52327b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.uj0 uj0Var2 = this.f52327b;
                l4 l4Var = new l4(17, this, context);
                this.f52328c = l4Var;
                uj0Var2.setAdapter(l4Var);
                this.f52327b.setOnItemClickListener(new ux0(this, 2));
                frameLayout.addView(this.f52327b, c8.ja.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131753919, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 24));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.uj0 uj0Var3 = new org.telegram.ui.Components.uj0(context, null);
                this.f52327b = uj0Var3;
                uj0Var3.setSectionsDrawBackground(true);
                this.f52327b.r1();
                this.f52327b.setLayoutManager(new v4.b0());
                this.f52327b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.uj0 uj0Var4 = this.f52327b;
                l4 l4Var2 = new l4(0, this, context);
                this.f52328c = l4Var2;
                uj0Var4.setAdapter(l4Var2);
                this.f52327b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f52327b, c8.ja.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, t70 t70Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, t70Var));
        showDialog(alertDialog$Builder.f28392a);
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        switch (this.f52326a) {
            case 0:
                return this.f52327b;
            default:
                return this.f52327b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f52326a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f52326a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
