package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import rf.o;
import w7.b6;
public final class b extends FrameLayout implements k6 {
    public final p6 f55784a;
    public final g9 f55785b;
    public final TextView f55786c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, p6 p6Var) {
        super(context);
        this.f55784a = p6Var;
        g9 g9Var = new g9(context);
        this.f55785b = g9Var;
        g9Var.setRoundRadius(i0.L(7.3125f));
        addView(g9Var, b6.d(26, 26.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f55786c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, b6.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, b6.d(-1, -2.0f, 19, 58.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131232188);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        updateColors();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull M0 = wp.r1(i10).M0(chat.f19794id);
        setTitle(o5.u(chat));
        if (M0 != null) {
            i11 = M0.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(dd.G(i11, "CommunityWithChats", new Object[0]));
        this.f55785b.e(chat, new r8(chat));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.f21331z6));
        hashSet.add(Integer.valueOf(t6.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        Drawable drawable = t6.S0;
        g9 g9Var = this.f55785b;
        o.a(canvas, drawable, (g9Var.getWidth() / 2.0f) + g9Var.getLeft(), (g9Var.getHeight() / 2.0f) + g9Var.getTop(), g9Var.getHeight());
        super.dispatchDraw(canvas);
        p6 p6Var = this.f55784a;
        if (p6Var != null) {
            paint = p6Var.d("paintDivider");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = t6.f21053k0;
        }
        canvas.drawLine(i0.L(58.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(56.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f55786c.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10 = t6.f21331z6;
        p6 p6Var = this.f55784a;
        this.e.setColorFilter(t6.w0(i10, p6Var));
        this.f55786c.setTextColor(t6.w0(t6.G6, p6Var));
        this.d.setTextColor(t6.w0(i10, p6Var));
    }
}
