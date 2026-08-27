package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gf.s;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public final class b extends FrameLayout implements x5 {

    public final c6 f46029a;

    public final n9 f46030b;

    public final TextView f46031c;
    public final TextView d;

    public final ImageView f46032e;

    public b(Context context, c6 c6Var) {
        super(context);
        this.f46029a = c6Var;
        n9 n9Var = new n9(context);
        this.f46030b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(n9Var, z5.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f46031c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, z5.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.f46032e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        d();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f22380id);
        setTitle(DialogObject.getShortName(chat));
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", chatFull != null ? chatFull.linked_peers.size() : 0, new Object[0]));
        this.f46030b.e(chat, new y8(chat));
    }

    @Override
    public final void d() {
        int i10 = g6.f23441z6;
        c6 c6Var = this.f46029a;
        this.f46032e.setColorFilter(g6.v0(i10, c6Var));
        this.f46031c.setTextColor(g6.v0(g6.G6, c6Var));
        this.d.setTextColor(g6.v0(i10, c6Var));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = g6.S0;
        n9 n9Var = this.f46030b;
        s.a(canvas, drawable, (n9Var.getWidth() / 2.0f) + n9Var.getLeft(), (n9Var.getHeight() / 2.0f) + n9Var.getTop(), n9Var.getHeight());
        super.dispatchDraw(canvas);
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
        this.f46031c.setText(charSequence);
    }
}
