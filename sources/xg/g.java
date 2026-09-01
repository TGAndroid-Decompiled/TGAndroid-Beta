package xg;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import k7.c6;
import k7.e6;
import ke.i;
import mh.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.wq;
import s5.m;
public final class g extends FrameLayout implements xd.b {
    public static final int[] f50582s;
    public final String[] f50583a;
    public final g6 f50584b;
    public final rg.a f50585c;
    public final og.a d;
    public final m[] f50586e;
    public final i[] f50587f;
    public a h;
    public b f50588n;
    public int f50589r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f50582s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public g(Context context, g6 g6Var, rg.b bVar, og.a aVar) {
        super(context);
        this.f50583a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.f50586e = new m[7];
        this.f50587f = new i[7];
        this.f50589r = 83;
        this.d = aVar;
        this.f50585c = bVar;
        this.f50584b = g6Var;
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            m[] mVarArr = this.f50586e;
            if (i11 < mVarArr.length && mVarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i10;
        int i11 = 0;
        float f10 = 0.0f;
        while (true) {
            m[] mVarArr = this.f50586e;
            if (i11 < mVarArr.length) {
                m mVar = mVarArr[i11];
                if (mVar != null) {
                    wg.b bVar = (wg.b) mVar.f47062b;
                    float f11 = ((xd.a) mVar.f47063c).f50505e;
                    float f12 = ((xd.a) mVar.d).f50505e;
                    if (f11 > 0.0f) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    bVar.setVisibility(i10);
                    bVar.setAlpha(f11);
                    bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                    bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                    if (i11 != 0) {
                        bVar.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(80.0f)) - f10);
                    }
                    f10 += (AndroidUtilities.dp((f12 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f11;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final i b(int i10) {
        i[] iVarArr = this.f50587f;
        if (iVarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f11142a = 0;
            obj.f11143b = false;
            obj.f11144c = true;
            iVarArr[i10] = obj;
        }
        return iVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z4) {
        boolean z10;
        b(i10).f11142a = i11;
        m mVar = this.f50586e[i10];
        if (mVar != null) {
            ((wg.b) mVar.f47062b).a(i11, z4);
            xd.a aVar = (xd.a) mVar.d;
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.a(z10, z4);
        }
    }

    public final void d(boolean z4) {
        b(1).f11143b = z4;
        m mVar = this.f50586e[1];
        if (mVar != null) {
            ((wg.b) mVar.f47062b).c(z4, true);
        }
    }

    public final void e(int i10, boolean z4, boolean z10) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i11;
        int i12;
        m[] mVarArr = this.f50586e;
        m mVar = mVarArr[i10];
        if (mVar == null && !z4) {
            return;
        }
        if (mVar == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = pr.h;
            } else {
                interpolator = wd.a.f49493a;
            }
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            xd.a aVar = new xd.a(i14, this, interpolator, j10, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = pr.h;
            } else {
                interpolator2 = wd.a.f49493a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            xd.a aVar2 = new xd.a(i15, this, interpolator3, j11, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            Context context = getContext();
            int i16 = f50582s[i10];
            g6 g6Var = this.f50584b;
            wg.b bVar = new wg.b(context, g6Var);
            wg.a d = wg.a.d(context, this.d, this.f50585c, g6Var, i16, i12);
            bVar.f49613b = d;
            bVar.addView(d, c6.e(i11, i11, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            e6.b(bVar, 0.13f, 2.0f);
            float f10 = i11 / 2.0f;
            bVar.setPivotX(AndroidUtilities.dp(f10));
            bVar.setPivotY(AndroidUtilities.dp(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f50583a[i10]);
            bVar.setOnClickListener(new x0(this, i10, 27));
            bVar.setOnLongClickListener(new rm0(this, i10, 1));
            if (i10 == 6) {
                wg.a aVar3 = bVar.f49613b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z11 = true;
            if (i10 == 1) {
                bVar.d = true;
                wq wqVar = bVar.f49614c;
                if (wqVar != null) {
                    wqVar.setReverse(true);
                }
            }
            addView(bVar, c6.e(i11, i11 + 8, this.f50589r));
            mVarArr[i10] = new m(bVar, aVar, aVar2, 9);
            i iVar = this.f50587f[i10];
            if (iVar != null) {
                bVar.a(iVar.f11142a, false);
                aVar.a(false, false);
                if (iVar.f11142a <= 0) {
                    z11 = false;
                }
                aVar2.a(z11, false);
                bVar.c(iVar.f11143b, false);
                bVar.b(iVar.f11144c, false);
            }
            a();
        }
        ((xd.a) mVarArr[i10].f47063c).a(z4, z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.f50589r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f50588n = bVar;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
