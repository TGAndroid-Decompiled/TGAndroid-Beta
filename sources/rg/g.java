package rg;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import fe.i;
import g7.e6;
import g7.g6;
import gh.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.tl0;
public final class g extends FrameLayout implements td.b {
    public static final int[] f47195s;
    public final String[] f47196a;
    public final b6 f47197b;
    public final lg.a f47198c;
    public final ig.a d;
    public final j4.c[] f47199e;
    public final i[] f47200f;
    public a h;
    public b f47201n;
    public int f47202r;

    static {
        int i9 = R.drawable.msg_input_attach2;
        int i10 = R.drawable.pagedown;
        f47195s = new int[]{i9, i10, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i10, i10};
    }

    public g(Context context, b6 b6Var, lg.b bVar, ig.a aVar) {
        super(context);
        this.f47196a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.f47199e = new j4.c[7];
        this.f47200f = new i[7];
        this.f47202r = 83;
        this.d = aVar;
        this.f47198c = bVar;
        this.f47197b = b6Var;
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10 = i9 >> 16;
        int i11 = i9 & 65535;
        if (i10 >= 0) {
            j4.c[] cVarArr = this.f47199e;
            if (i10 < cVarArr.length && cVarArr[i10] != null) {
                if (i11 == 1 || i11 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i9;
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            j4.c[] cVarArr = this.f47199e;
            if (i10 < cVarArr.length) {
                j4.c cVar = cVarArr[i10];
                if (cVar != null) {
                    qg.b bVar = (qg.b) cVar.f13431b;
                    float f11 = ((td.a) cVar.f13432c).f47775e;
                    float f12 = ((td.a) cVar.d).f47775e;
                    if (f11 > 0.0f) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    bVar.setVisibility(i9);
                    bVar.setAlpha(f11);
                    bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                    bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                    if (i10 != 0) {
                        bVar.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(80.0f)) - f10);
                    }
                    f10 += (AndroidUtilities.dp((f12 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f11;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final i b(int i9) {
        i[] iVarArr = this.f47200f;
        if (iVarArr[i9] == 0) {
            ?? obj = new Object();
            obj.f6085a = 0;
            obj.f6086b = false;
            obj.f6087c = true;
            iVarArr[i9] = obj;
        }
        return iVarArr[i9];
    }

    public final void c(int i9, int i10, boolean z10) {
        boolean z11;
        b(i9).f6085a = i10;
        j4.c cVar = this.f47199e[i9];
        if (cVar != null) {
            ((qg.b) cVar.f13431b).a(i10, z10);
            td.a aVar = (td.a) cVar.d;
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f6086b = z10;
        j4.c cVar = this.f47199e[1];
        if (cVar != null) {
            ((qg.b) cVar.f13431b).c(z10, true);
        }
    }

    public final void e(int i9, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i10;
        int i11;
        j4.c[] cVarArr = this.f47199e;
        j4.c cVar = cVarArr[i9];
        if (cVar == null && !z10) {
            return;
        }
        if (cVar == null) {
            int i12 = i9 << 16;
            int i13 = i12 | 1;
            if (i9 == 0) {
                interpolator = gr.h;
            } else {
                interpolator = sd.a.f47511a;
            }
            if (i9 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            td.a aVar = new td.a(i13, this, interpolator, j10, false);
            int i14 = i12 | 2;
            if (i9 == 0) {
                interpolator2 = gr.h;
            } else {
                interpolator2 = sd.a.f47511a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i9 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            td.a aVar2 = new td.a(i14, this, interpolator3, j11, false);
            if (i9 == 0) {
                i10 = 50;
                i11 = 32;
            } else {
                i10 = 56;
                i11 = 48;
            }
            Context context = getContext();
            int i15 = f47195s[i9];
            b6 b6Var = this.f47197b;
            qg.b bVar = new qg.b(context, b6Var);
            qg.a d = qg.a.d(context, this.d, this.f47198c, b6Var, i15, i11);
            bVar.f46265b = d;
            bVar.addView(d, e6.e(i10, i10, 80));
            d.setIconPadding(AndroidUtilities.dp(2.0f));
            g6.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(AndroidUtilities.dp(f10));
            bVar.setPivotY(AndroidUtilities.dp(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f47196a[i9]);
            bVar.setOnClickListener(new z0(this, i9, 27));
            bVar.setOnLongClickListener(new tl0(this, i9, 1));
            if (i9 == 6) {
                qg.a aVar3 = bVar.f46265b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i9 == 1) {
                bVar.d = true;
                mq mqVar = bVar.f46266c;
                if (mqVar != null) {
                    mqVar.setReverse(true);
                }
            }
            addView(bVar, e6.e(i10, i10 + 8, this.f47202r));
            cVarArr[i9] = new j4.c(bVar, aVar, aVar2, false, 28);
            i iVar = this.f47200f[i9];
            if (iVar != null) {
                bVar.a(iVar.f6085a, false);
                aVar.a(false, false);
                if (iVar.f6085a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(iVar.f6086b, false);
                bVar.b(iVar.f6087c, false);
            }
            a();
        }
        ((td.a) cVarArr[i9].f13432c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i9) {
        this.f47202r = i9;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f47201n = bVar;
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
