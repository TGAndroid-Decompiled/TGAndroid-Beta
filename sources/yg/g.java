package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.na;
import fi.u3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import wg.y0;
public final class g extends c implements b6 {
    public int E;
    public final ImageView f61243s;
    public f f61244w;
    public TLRPC.Chat f61245x;
    public boolean f61246y;

    public g(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f61243s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = m6.x0(null, m6.Mi, false);
        this.E = x02;
        imageView.setBackground(m6.h0(x02, 1, -1));
        imageView.setImageResource(2131232563);
        t6.s(imageView, m6.f29512m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(hd.N0(2131751586, null));
        boolean z10 = hd.f24408a0;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i10 = i7 | 17;
        if (z10) {
            f10 = 3.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 3.0f;
        }
        addView(imageView, na.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
        u3 u3Var = this.d;
        if (hd.f24408a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        u3Var.setPadding(g0.L(f12), 0, g0.L(hd.f24408a0 ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z10, int i10) {
        String str;
        int i11;
        String N0;
        String str2;
        this.f61246y = z10;
        this.f61245x = chat;
        b9 b9Var = this.f61222b;
        b9Var.q(chat);
        int L = g0.L(20.0f);
        q9 q9Var = this.f61223c;
        q9Var.setRoundRadius(L);
        q9Var.f(chat, b9Var);
        String str3 = chat.title;
        u3 u3Var = this.d;
        u3Var.k(j6.m(str3, u3Var.getPaint().getFontMetricsInt(), false, null, 0));
        boolean V = v3.V(chat);
        if (z10) {
            if (i10 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                N0 = hd.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i11 = 2131751378;
                } else {
                    i11 = 2131754876;
                }
                N0 = hd.N0(i11, null);
            }
            setSubtitle(N0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(hd.G(i7, str, new Object[0]));
        }
        t6.X(this.f61224e, m6.f29605r5, this.f61221a);
        setDivider(true);
        ImageView imageView = this.f61243s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new y0(3, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f61245x;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f61243s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f61244w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = m6.x0(null, m6.Mi, false);
            ImageView imageView = this.f61243s;
            if (imageView != null && x02 != this.E) {
                this.E = x02;
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
