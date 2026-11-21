package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zy0 extends org.telegram.ui.ActionBar.g2 {
    public static final int[] d = {750000, 1000000, 1200000, 2000000};
    public final int f54662a;
    public org.telegram.ui.Components.ek0 f54663b;
    public org.telegram.ui.Components.dk0 f54664c;

    public zy0(int i7, Bundle bundle) {
        super(bundle);
        this.f54662a = i7;
    }

    public static void Z(zy0 zy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.f1662b;
            boolean z10 = !MediaController.s0(zy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1654c = true;
                aVar.f1653b = true;
                aj.d.f1660a.edit().putBoolean("audio_recorder_v2_enabled", z10).apply();
            }
            ((l4) zy0Var.f54664c).f();
        } else if (MediaController.s0(zy0Var.currentAccount) && i7 == 2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zy0Var.getParentActivity());
            alertDialog$Builder.f28774a.S = org.telegram.messenger.gd.N0(2131753919, null);
            alertDialog$Builder.f(new CharSequence[]{org.telegram.messenger.gd.N0(2131753918, null), org.telegram.messenger.gd.N0(2131753917, null)}, new k4(zy0Var, 0));
            zy0Var.showDialog(alertDialog$Builder.f28774a);
        }
    }

    public static void a0(zy0 zy0Var, int i7) {
        if (i7 == 1) {
            aj.a aVar = aj.e.d;
            boolean z10 = !org.telegram.ui.Components.h50.e(zy0Var.currentAccount);
            synchronized (aVar) {
                aVar.d = z10;
                aVar.f1654c = true;
                aVar.f1653b = true;
                aj.d.f1660a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
            }
            ((l4) zy0Var.f54664c).f();
        } else if (org.telegram.ui.Components.h50.e(zy0Var.currentAccount)) {
            int i10 = 0;
            if (i7 == 2) {
                zy0Var.g0(2131745790, new CharSequence[]{"480p", "360p"}, new m60(13));
            } else if (i7 == 3) {
                zy0Var.g0(2131745800, new CharSequence[]{org.telegram.messenger.gd.N0(2131745799, null), org.telegram.messenger.gd.N0(2131745797, null), org.telegram.messenger.gd.N0(2131745798, null)}, new m60(14));
            } else if (i7 == 4) {
                zy0Var.g0(2131745793, new CharSequence[]{"30 FPS", "60 FPS"}, new m60(15));
            } else if (i7 == 5) {
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = d;
                    if (i10 < 3) {
                        charSequenceArr[i10] = f0(iArr[i10]);
                        i10++;
                    } else {
                        zy0Var.g0(2131745801, charSequenceArr, new m60(16));
                        return;
                    }
                }
            } else if (i7 == 8) {
                aj.a aVar2 = aj.e.f1667i;
                aVar2.a();
                aVar2.b(true ^ aVar2.d);
                ((l4) zy0Var.f54664c).g(i7);
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
        switch (this.f54662a) {
            case 0:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131745789, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 10));
                FrameLayout frameLayout = new FrameLayout(context);
                this.fragmentView = frameLayout;
                org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
                this.f54663b = ek0Var;
                ek0Var.r1();
                this.f54663b.setSectionsDrawBackground(true);
                this.f54663b.setLayoutManager(new v4.c0());
                this.f54663b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ek0 ek0Var2 = this.f54663b;
                l4 l4Var = new l4(17, this, context);
                this.f54664c = l4Var;
                ek0Var2.setAdapter(l4Var);
                this.f54663b.setOnItemClickListener(new zx0(this, 2));
                frameLayout.addView(this.f54663b, c8.ma.c(-1.0f, -1));
                return this.fragmentView;
            default:
                setHasOwnBackground(true);
                this.simpleActionBar.setBackButtonImage(2131231240);
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753916, null));
                this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 26));
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.fragmentView = frameLayout2;
                org.telegram.ui.Components.ek0 ek0Var3 = new org.telegram.ui.Components.ek0(context, null);
                this.f54663b = ek0Var3;
                ek0Var3.setSectionsDrawBackground(true);
                this.f54663b.r1();
                this.f54663b.setLayoutManager(new v4.c0());
                this.f54663b.setVerticalScrollBarEnabled(false);
                org.telegram.ui.Components.ek0 ek0Var4 = this.f54663b;
                l4 l4Var2 = new l4(0, this, context);
                this.f54664c = l4Var2;
                ek0Var4.setAdapter(l4Var2);
                this.f54663b.setOnItemClickListener(new h(this, 2));
                frameLayout2.addView(this.f54663b, c8.ma.c(-1.0f, -1));
                return this.fragmentView;
        }
    }

    public void g0(int i7, CharSequence[] charSequenceArr, m60 m60Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f28774a.S = org.telegram.messenger.gd.N0(i7, null);
        alertDialog$Builder.f(charSequenceArr, new og.j(11, this, m60Var));
        showDialog(alertDialog$Builder.f28774a);
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        switch (this.f54662a) {
            case 0:
                return this.f54663b;
            default:
                return this.f54663b;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        switch (this.f54662a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        switch (this.f54662a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
