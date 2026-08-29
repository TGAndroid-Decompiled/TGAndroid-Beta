package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;
public final class b extends FrameLayout implements x5 {
    public final c6 f47433a;
    public final t9 f47434b;
    public final TextView f47435c;
    public final TextView d;
    public final ImageView f47436e;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f47433a = c6Var;
        t9 t9Var = new t9(context);
        this.f47434b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(t9Var, f6.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f47435c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, f6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, f6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, f6.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f47436e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, f6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22392id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f47434b.e(chat, new e9(chat));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = g6.S0;
        t9 t9Var = this.f47434b;
        r.a(canvas, drawable, (t9Var.getWidth() / 2.0f) + t9Var.getLeft(), (t9Var.getHeight() / 2.0f) + t9Var.getTop(), t9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        int i10 = g6.f23450z6;
        c6 c6Var = this.f47433a;
        this.f47436e.setColorFilter(g6.v0(i10, c6Var));
        this.f47435c.setTextColor(g6.v0(g6.G6, c6Var));
        this.d.setTextColor(g6.v0(i10, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47435c.setText(charSequence);
    }
}
