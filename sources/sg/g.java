package sg;

import android.content.Context;
import android.widget.FrameLayout;
import ge.i;
import h7.b6;
import h7.z5;
import hh.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.wl0;

public final class g extends FrameLayout implements ud.b {

    public static final int[] f47916s;

    public final String[] f47917a;

    public final c6 f47918b;

    public final mg.a f47919c;
    public final jg.a d;

    public final j9.a[] f47920e;

    public final i[] f47921f;
    public a h;

    public b f47922n;

    public int f47923r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        f47916s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public g(Context context, c6 c6Var, mg.b bVar, jg.a aVar) {
        super(context);
        this.f47917a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.f47920e = new j9.a[7];
        this.f47921f = new i[7];
        this.f47923r = 83;
        this.d = aVar;
        this.f47919c = bVar;
        this.f47918b = c6Var;
    }

    public final void a() {
        int i10 = 0;
        float fDp = 0.0f;
        while (true) {
            j9.a[] aVarArr = this.f47920e;
            if (i10 >= aVarArr.length) {
                return;
            }
            j9.a aVar = aVarArr[i10];
            if (aVar != null) {
                rg.b bVar = (rg.b) aVar.f12863b;
                float f10 = ((ud.a) aVar.f12864c).f48497e;
                float f11 = ((ud.a) aVar.d).f48497e;
                bVar.setVisibility(f10 > 0.0f ? 0 : 8);
                bVar.setAlpha(f10);
                bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                if (i10 != 0) {
                    bVar.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(80.0f)) - fDp);
                }
                fDp += (AndroidUtilities.dp((f11 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f10;
            }
            i10++;
        }
    }

    public final i b(int i10) {
        i[] iVarArr = this.f47921f;
        if (iVarArr[i10] == null) {
            i iVar = new i();
            iVar.f6885a = 0;
            iVar.f6886b = false;
            iVar.f6887c = true;
            iVarArr[i10] = iVar;
        }
        return iVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).f6885a = i11;
        j9.a aVar = this.f47920e[i10];
        if (aVar != null) {
            ((rg.b) aVar.f12863b).a(i11, z10);
            ((ud.a) aVar.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f6886b = z10;
        j9.a aVar = this.f47920e[1];
        if (aVar != null) {
            ((rg.b) aVar.f12863b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        j9.a[] aVarArr = this.f47920e;
        j9.a aVar = aVarArr[i10];
        if (aVar != null || z10) {
            if (aVar == null) {
                int i13 = i10 << 16;
                ud.a aVar2 = new ud.a(i13 | 1, this, i10 == 0 ? er.h : td.a.f48160a, i10 == 0 ? 300L : 280L, false);
                ud.a aVar3 = new ud.a(i13 | 2, this, i10 == 0 ? er.h : td.a.f48160a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                Context context = getContext();
                int i14 = f47916s[i10];
                c6 c6Var = this.f47918b;
                rg.b bVar = new rg.b(context, c6Var);
                rg.a aVarD = rg.a.d(context, this.d, this.f47919c, c6Var, i14, i12);
                bVar.f47024b = aVarD;
                bVar.addView(aVarD, z5.e(i11, i11, 80));
                aVarD.setIconPadding(AndroidUtilities.dp(2.0f));
                b6.b(bVar, 0.13f, 2.0f);
                float f10 = i11 / 2.0f;
                bVar.setPivotX(AndroidUtilities.dp(f10));
                bVar.setPivotY(AndroidUtilities.dp(f10 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.f47917a[i10]);
                bVar.setOnClickListener(new z0(this, i10, 27));
                bVar.setOnLongClickListener(new wl0(this, i10, 1));
                if (i10 == 6) {
                    rg.a aVar4 = bVar.f47024b;
                    aVar4.h = -1.0f;
                    aVar4.a();
                }
                if (i10 == 1) {
                    bVar.d = true;
                    kq kqVar = bVar.f47025c;
                    if (kqVar != null) {
                        kqVar.setReverse(true);
                    }
                }
                addView(bVar, z5.e(i11, i11 + 8, this.f47923r));
                aVarArr[i10] = new j9.a(bVar, aVar2, aVar3, false, 28);
                i iVar = this.f47921f[i10];
                if (iVar != null) {
                    bVar.a(iVar.f6885a, false);
                    aVar2.a(false, false);
                    aVar3.a(iVar.f6885a > 0, false);
                    bVar.c(iVar.f6886b, false);
                    bVar.b(iVar.f6887c, false);
                }
                a();
            }
            ((ud.a) aVarArr[i10].f12864c).a(z10, z11);
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            j9.a[] aVarArr = this.f47920e;
            if (i11 >= aVarArr.length || aVarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    public void setGravity(int i10) {
        this.f47923r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f47922n = bVar;
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
