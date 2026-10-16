package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import bi.l5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.bz0;
import w7.z5;
public final class g extends c {
    public final ImageView f47581s;
    public f v;
    public TLRPC.Chat f47582w;
    public boolean f47583x;

    public g(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        float f7;
        float f10;
        float f11;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f47581s = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(g6.g0(g6.x0(null, g6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.x0(null, g6.f19764m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setContentDescription(LocaleController.getString(R.string.Delete));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i11 = i10 | 17;
        if (z10) {
            f7 = 3.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 3.0f;
        }
        addView(imageView, z5.a(50.0f, f7, 0.0f, f10, 0.0f, 48, i11));
        l5 l5Var = this.d;
        if (LocaleController.isRTL) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        l5Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void f(TLRPC.Chat chat, int i10, boolean z10, int i11) {
        String str;
        int i12;
        String string;
        String str2;
        this.f47583x = z10;
        this.f47582w = chat;
        k9 k9Var = this.f47565b;
        k9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        z9 z9Var = this.f47566c;
        z9Var.setRoundRadius(dp);
        z9Var.e(chat, k9Var);
        String str3 = chat.title;
        l5 l5Var = this.d;
        l5Var.k(Emoji.replaceEmoji(str3, l5Var.getPaint().getFontMetricsInt(), false));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (z10) {
            if (i11 >= 1) {
                if (isChannelAndNotMegaGroup) {
                    str2 = "Subscribers";
                } else {
                    str2 = "Members";
                }
                string = LocaleController.formatPluralString(str2, i11, new Object[0]);
            } else {
                if (isChannelAndNotMegaGroup) {
                    i12 = R.string.DiscussChannel;
                } else {
                    i12 = R.string.AccDescrGroup;
                }
                string = LocaleController.getString(i12);
            }
            setSubtitle(string);
        } else {
            if (isChannelAndNotMegaGroup) {
                str = "BoostingChannelWillReceiveBoost";
            } else {
                str = "BoostingGroupWillReceiveBoost";
            }
            setSubtitle(LocaleController.formatPluralString(str, i10, new Object[0]));
        }
        this.e.setTextColor(g6.w0(g6.f19857r5, this.f47564a));
        setDivider(true);
        ImageView imageView = this.f47581s;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new bz0(27, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.f47582w;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f47581s.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.v = fVar;
    }
}
