package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.w71;
import w7.a6;
public final class g extends c {
    public final ImageView f42692r;
    public f f42693s;
    public TLRPC.Chat v;
    public boolean f42694w;

    public g(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        float f7;
        float f10;
        float f11;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f42692r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(j6.f0(j6.w0(null, j6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f18091m6, false), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, a6.d(48, 50.0f, i11, f7, 0.0f, f10, 0.0f));
        f4 f4Var = this.d;
        if (LocaleController.isRTL) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        f4Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
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
        this.f42694w = z10;
        this.v = chat;
        g9 g9Var = this.f42676b;
        g9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f42677c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, g9Var);
        String str3 = chat.title;
        f4 f4Var = this.d;
        f4Var.k(Emoji.replaceEmoji(str3, f4Var.getPaint().getFontMetricsInt(), false));
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
        this.e.setTextColor(j6.v0(j6.f18179r5, this.f42675a));
        setDivider(true);
        ImageView imageView = this.f42692r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new w71(17, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f42692r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f42693s = fVar;
    }
}
