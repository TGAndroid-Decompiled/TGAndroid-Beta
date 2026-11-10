package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ha;
import di.e4;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import wg.a1;
public final class g extends c implements c6 {
    public int D;
    public final ImageView f59461s;
    public f f59462w;
    public TLRPC.Chat f59463x;
    public boolean f59464y;

    public g(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f59461s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = m6.x0(null, m6.Ji, false);
        this.D = x02;
        imageView.setBackground(m6.h0(x02, 1, -1));
        imageView.setImageResource(2131232561);
        t6.s(imageView, m6.f28055m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(id.M0(2131751598, null));
        boolean z9 = id.f23161a0;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i10 = i7 | 17;
        if (z9) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, ha.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
        e4 e4Var = this.d;
        if (id.f23161a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        e4Var.setPadding(g0.L(f12), 0, g0.L(id.f23161a0 ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z9, int i10) {
        String str;
        int i11;
        String M0;
        String str2;
        this.f59464y = z9;
        this.f59463x = chat;
        v8 v8Var = this.f59440b;
        v8Var.q(chat);
        int L = g0.L(20.0f);
        k9 k9Var = this.f59441c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, v8Var);
        String str3 = chat.title;
        e4 e4Var = this.d;
        e4Var.k(i6.m(str3, e4Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = t3.V(chat);
        if (z9) {
            if (i10 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                M0 = id.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i11 = 2131751390;
                } else {
                    i11 = 2131754876;
                }
                M0 = id.M0(i11, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(id.G(i7, str, new Object[0]));
        }
        t6.X(this.f59442e, m6.f28148r5, this.f59439a);
        setDivider(true);
        ImageView imageView = this.f59461s;
        if (z9) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new a1(2, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f59463x;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f59461s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f59462w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = m6.x0(null, m6.Ji, false);
            ImageView imageView = this.f59461s;
            if (imageView != null && x02 != this.D) {
                this.D = x02;
                m6.H1(imageView.getBackground(), x02, true);
                imageView.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
