package ug;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import i7.f6;
import i7.h6;
import ie.i;
import jh.y0;
import l3.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qq;
public final class g extends FrameLayout implements vd.b {
    public static final int[] f49232s;
    public final String[] f49233a;
    public final c6 f49234b;
    public final og.a f49235c;
    public final lg.a d;
    public final g0[] f49236e;
    public final i[] f49237f;
    public a h;
    public b f49238n;
    public int f49239r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f49232s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public g(Context context, c6 c6Var, og.b bVar, lg.a aVar) {
        super(context);
        this.f49233a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.f49236e = new g0[7];
        this.f49237f = new i[7];
        this.f49239r = 83;
        this.d = aVar;
        this.f49235c = bVar;
        this.f49234b = c6Var;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            g0[] g0VarArr = this.f49236e;
            if (i11 < g0VarArr.length && g0VarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i10;
        int i11 = 0;
        float f9 = 0.0f;
        while (true) {
            g0[] g0VarArr = this.f49236e;
            if (i11 < g0VarArr.length) {
                g0 g0Var = g0VarArr[i11];
                if (g0Var != null) {
                    tg.b bVar = (tg.b) g0Var.f14096b;
                    float f10 = ((vd.a) g0Var.f14097c).f49505e;
                    float f11 = ((vd.a) g0Var.d).f49505e;
                    if (f10 > 0.0f) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    bVar.setVisibility(i10);
                    bVar.setAlpha(f10);
                    bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                    bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                    if (i11 != 0) {
                        bVar.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(80.0f)) - f9);
                    }
                    f9 += (AndroidUtilities.dp((f11 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f10;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final i b(int i10) {
        i[] iVarArr = this.f49237f;
        if (iVarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f8922a = 0;
            obj.f8923b = false;
            obj.f8924c = true;
            iVarArr[i10] = obj;
        }
        return iVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        boolean z11;
        b(i10).f8922a = i11;
        g0 g0Var = this.f49236e[i10];
        if (g0Var != null) {
            ((tg.b) g0Var.f14096b).a(i11, z10);
            vd.a aVar = (vd.a) g0Var.d;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f8923b = z10;
        g0 g0Var = this.f49236e[1];
        if (g0Var != null) {
            ((tg.b) g0Var.f14096b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i11;
        int i12;
        g0[] g0VarArr = this.f49236e;
        g0 g0Var = g0VarArr[i10];
        if (g0Var == null && !z10) {
            return;
        }
        if (g0Var == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = jr.h;
            } else {
                interpolator = ud.a.f49172a;
            }
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            vd.a aVar = new vd.a(i14, this, interpolator, j10, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = jr.h;
            } else {
                interpolator2 = ud.a.f49172a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            vd.a aVar2 = new vd.a(i15, this, interpolator3, j11, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            Context context = getContext();
            int i16 = f49232s[i10];
            c6 c6Var = this.f49234b;
            tg.b bVar = new tg.b(context, c6Var);
            tg.a d = tg.a.d(context, this.d, this.f49235c, c6Var, i16, i12);
            bVar.f48324b = d;
            bVar.addView(d, f6.e(i11, i11, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            h6.b(bVar, 0.13f, 2.0f);
            float f9 = i11 / 2.0f;
            bVar.setPivotX(AndroidUtilities.dp(f9));
            bVar.setPivotY(AndroidUtilities.dp(f9 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f49233a[i10]);
            bVar.setOnClickListener(new y0(this, i10, 27));
            bVar.setOnLongClickListener(new gm0(this, i10, 1));
            if (i10 == 6) {
                tg.a aVar3 = bVar.f48324b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i10 == 1) {
                bVar.d = true;
                qq qqVar = bVar.f48325c;
                if (qqVar != null) {
                    qqVar.setReverse(true);
                }
            }
            addView(bVar, f6.e(i11, i11 + 8, this.f49239r));
            g0VarArr[i10] = new g0(bVar, aVar, aVar2, false, 29);
            i iVar = this.f49237f[i10];
            if (iVar != null) {
                bVar.a(iVar.f8922a, false);
                aVar.a(false, false);
                if (iVar.f8922a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(iVar.f8923b, false);
                bVar.b(iVar.f8924c, false);
            }
            a();
        }
        ((vd.a) g0VarArr[i10].f14097c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.f49239r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f49238n = bVar;
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
