package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zy0 extends org.telegram.ui.ActionBar.h2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f54615a;
    public org.telegram.ui.Components.ck0 f54616b;
    public org.telegram.ui.Components.bk0 f54617c;

    public zy0(int i7, Bundle bundle) {
        super(bundle);
        this.f54615a = i7;
    }

    public static void Z(zy0 zy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.f1650b;
            boolean z10 = !MediaController.s0(zy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1642c = true;
                aVar.f1641b = true;
                aj.d.f1648a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            ((l4) zy0Var.f54617c).f();
        } else if (MediaController.s0(zy0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zy0Var.getParentActivity());
            alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(2131753920, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.M0(2131753919, null), org.telegram.messenger.gd.M0(2131753918, null)}, new k4(zy0Var, 0));
            zy0Var.showDialog(alertDialog$Builder.f28744a);
        }
    }

    public static void a0(zy0 zy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.d;
            boolean z10 = !org.telegram.ui.Components.e50.e(zy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1642c = true;
                aVar.f1641b = true;
                aj.d.f1648a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((l4) zy0Var.f54617c).f();
        } else if (org.telegram.ui.Components.e50.e(zy0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                zy0Var.g0(2131745791, new CharSequence[]{"480p", "360p"}, new l60(13));
            } else if (i7 == 3) {
                zy0Var.g0(2131745801, new CharSequence[]{org.telegram.messenger.gd.M0(2131745800, null), org.telegram.messenger.gd.M0(2131745798, null), org.telegram.messenger.gd.M0(2131745799, null)}, new l60(14));
            } else if (i7 == 4) {
                zy0Var.g0(2131745794, new CharSequence[]{"30 FPS", "60 FPS"}, new l60(15));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        zy0Var.g0(2131745802, charSequenceArr, new l60(16));
                        return;
                    }
                }
            } else if (i7 == 8) {
                aj.a aVar2 = aj.e.f1655i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) zy0Var.f54617c).g(i7);
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
        switch (this.f54615a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131745790, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 10));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
                this.f54616b = ck0Var;
                ck0Var.r1();
                this.f54616b.setSectionsDrawBackground(true);
                this.f54616b.setLayoutManager(new v4.c0());
                this.f54616b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ck0 ck0Var2 = this.f54616b;
                l4 l4Var = new l4(17, this, context);
                this.f54617c = l4Var;
                ck0Var2.setAdapter(l4Var);
                this.f54616b.setOnItemClickListener(new zx0(this, 2));
                frameLayout.addView(this.f54616b, c8.ma.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131753917, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 26));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.ck0 ck0Var3 = new org.telegram.ui.Components.ck0(context, null);
                this.f54616b = ck0Var3;
                ck0Var3.setSectionsDrawBackground(true);
                this.f54616b.r1();
                this.f54616b.setLayoutManager(new v4.c0());
                this.f54616b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ck0 ck0Var4 = this.f54616b;
                l4 l4Var2 = new l4(0, this, context);
                this.f54617c = l4Var2;
                ck0Var4.setAdapter(l4Var2);
                this.f54616b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f54616b, c8.ma.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, l60 l60Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f28744a.S = org.telegram.messenger.gd.M0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, l60Var));
        showDialog(alertDialog$Builder.f28744a);
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        switch (this.f54615a) {
            case 0:
                return this.f54616b;
            default:
                return this.f54616b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f54615a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f54615a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
