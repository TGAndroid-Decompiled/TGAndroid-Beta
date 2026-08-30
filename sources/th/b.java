package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
public final class b extends FrameLayout implements a6 {
    public final f6 f44938a;
    public final p9 f44939b;
    public final TextView f44940c;
    public final TextView d;
    public final ImageView e;

    public b(Context context, f6 f6Var) {
        super(context);
        this.f44938a = f6Var;
        p9 p9Var = new p9(context);
        this.f44939b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        addView(p9Var, b6.d(32, 32.0f, 19, 20.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.f44940c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, b6.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        addView(linearLayout, b6.d(-1, -2.0f, 19, 67.0f, 0.0f, 48.0f, 1.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        e();
    }

    public final void a(int i10, TLRPC.Chat chat) {
        int i11;
        if (chat == null) {
            return;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(chat.f19184id);
        setTitle(DialogObject.getShortName(chat));
        if (chatFull != null) {
            i11 = chatFull.linked_peers.size();
        } else {
            i11 = 0;
        }
        setSubtitle(LocaleController.formatPluralString("CommunityWithChats", i11, new Object[0]));
        this.f44939b.e(chat, new z8(chat));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable = j6.S0;
        p9 p9Var = this.f44939b;
        r.a(canvas, drawable, (p9Var.getWidth() / 2.0f) + p9Var.getLeft(), (p9Var.getHeight() / 2.0f) + p9Var.getTop(), p9Var.getHeight());
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        int i10 = j6.f20298z6;
        f6 f6Var = this.f44938a;
        this.e.setColorFilter(j6.v0(i10, f6Var));
        this.f44940c.setTextColor(j6.v0(j6.G6, f6Var));
        this.d.setTextColor(j6.v0(i10, f6Var));
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
        this.f44940c.setText(charSequence);
    }
}
