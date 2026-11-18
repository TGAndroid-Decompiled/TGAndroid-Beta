package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import c8.ma;
import fi.u3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
public final class g extends c implements c6 {
    public int E;
    public final ImageView f61233s;
    public f f61234w;
    public TLRPC.Chat f61235x;
    public boolean f61236y;

    public g(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        float f10;
        float f11;
        float f12;
        this.d.setTypeface(g0.o());
        ImageView imageView = new ImageView(context);
        this.f61233s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int x02 = n6.x0(null, n6.Mi, false);
        this.E = x02;
        imageView.setBackground(n6.h0(x02, 1, -1));
        imageView.setImageResource(2131232563);
        u6.s(imageView, n6.f29559m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setContentDescription(gd.M0(2131751587, null));
        boolean z10 = gd.f24213a0;
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
        addView(imageView, ma.d(48, 50.0f, i10, f10, 0.0f, f11, 0.0f));
        u3 u3Var = this.d;
        if (gd.f24213a0) {
            f12 = 24.0f;
        } else {
            f12 = 0.0f;
        }
        u3Var.setPadding(g0.L(f12), 0, g0.L(gd.f24213a0 ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i7, boolean z10, int i10) {
        String str;
        int i11;
        String M0;
        String str2;
        this.f61236y = z10;
        this.f61235x = chat;
        b9 b9Var = this.f61212b;
        b9Var.q(chat);
        int L = g0.L(20.0f);
        q9 q9Var = this.f61213c;
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
                M0 = gd.G(i10, str2, new Object[0]);
            } else {
                if (V) {
                    i11 = 2131751379;
                } else {
                    i11 = 2131754876;
                }
                M0 = gd.M0(i11, null);
            }
            setSubtitle(M0);
        } else {
            if (V) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(gd.G(i7, str, new Object[0]));
        }
        u6.X(this.f61214e, n6.f29652r5, this.f61211a);
        setDivider(true);
        ImageView imageView = this.f61233s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new ug.a0(5, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f61235x;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f61233s.measure(View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f61234w = fVar;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = n6.x0(null, n6.Mi, false);
            ImageView imageView = this.f61233s;
            if (imageView != null && x02 != this.E) {
                this.E = x02;
                n6.H1(imageView.getBackground(), x02, true);
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
