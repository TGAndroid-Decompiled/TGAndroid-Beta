package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
public final class p extends FrameLayout {
    public final h5 f45741a;
    public final dh.u f45742b;
    public final h5 f45743c;
    public final b6 d;
    public boolean f45744e;
    public TL_account.TL_businessChatLink f45745f;

    public p(Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        this.d = b6Var;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(f6.K(AndroidUtilities.dp(36.0f), f6.w0(null, f6.Oh, false)));
        imageView.setOnClickListener(new x8(this, 18));
        addView(imageView, e6.i(36.0f, 36.0f, 8388627, 14.0f, 0.0f, 14.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f45741a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTextColor(f6.w0(null, f6.G6, false));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        h5Var.setGravity(i9);
        addView(h5Var, e6.i(-1.0f, 20.0f, 55, 64.0f, 10.0f, 14.0f, 0.0f));
        h5 h5Var2 = new h5(context);
        this.f45743c = h5Var2;
        h5Var2.setTextSize(14);
        int i11 = f6.f23386z6;
        h5Var2.setTextColor(f6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10);
        addView(h5Var2, e6.i(-1.0f, 18.0f, 55, 64.0f, 10.66f, 14.0f, 0.0f));
        dh.u uVar = new dh.u(context);
        this.f45742b = uVar;
        uVar.setTextSize(1, 13.0f);
        uVar.setMaxLines(1);
        uVar.setEllipsize(TextUtils.TruncateAt.END);
        uVar.setTextColor(f6.v0(i11, b6Var));
        uVar.setGravity(LocaleController.isRTL ? 5 : 3);
        uVar.f4671f = false;
        uVar.setUseAlphaForEmoji(false);
        NotificationCenter.listenEmojiLoading(uVar);
        addView(uVar, e6.i(-1.0f, 20.0f, 87, 64.0f, 0.0f, 14.0f, 6.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f45744e) {
            Paint T0 = f6.T0("paintDivider", this.d);
            if (T0 == null) {
                T0 = f6.f23121k0;
            }
            Paint paint = T0;
            float f11 = 64.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 64.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        boolean z11 = LocaleController.isRTL;
        h5 h5Var = this.f45743c;
        h5 h5Var2 = this.f45741a;
        if (z11) {
            h5Var2.setPadding(h5Var.getTextWidth(), 0, 0, 0);
        } else {
            h5Var2.setPadding(0, 0, h5Var.getTextWidth(), 0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f) + (this.f45744e ? 1 : 0), 1073741824));
    }
}
