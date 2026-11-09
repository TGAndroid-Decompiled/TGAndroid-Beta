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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import wg.z0;
public final class g extends c implements b6 {
    public int D;
    public final ImageView f59463s;
    public f f59464w;
    public TLRPC.Chat f59465x;
    public boolean f59466y;

    public g(Context context, g6 g6Var) {
        super(context, g6Var);
        int i7;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f59463s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = l6.x0(null, l6.Ji, false);
        this.D = x02;
        imageView.setBackground(l6.h0(x02, 1, -1));
        imageView.setImageResource(2131232561);
        s6.s(imageView, l6.f28030m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(id.M0(2131751598, null));
        boolean z9 = id.f23157a0;
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
        if (id.f23157a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        e4Var.setPadding(g0.L(f12), 0, g0.L(id.f23157a0 ? 0.0f : 24.0f), 0);
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
        this.f59466y = z9;
        this.f59465x = chat;
        w8 w8Var = this.f59442b;
        w8Var.q(chat);
        int L = g0.L(20.0f);
        l9 l9Var = this.f59443c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
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
        s6.X(this.f59444e, l6.f28123r5, this.f59441a);
        setDivider(true);
        ImageView imageView = this.f59463s;
        if (z9) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new z0(3, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f59465x;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f59463s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f59464w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = l6.x0(null, l6.Ji, false);
            ImageView imageView = this.f59463s;
            if (imageView != null && x02 != this.D) {
                this.D = x02;
                l6.H1(imageView.getBackground(), x02, true);
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
