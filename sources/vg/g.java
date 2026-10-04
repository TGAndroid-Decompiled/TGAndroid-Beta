package vg;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.py0;
import w7.z5;
public final class g extends c {
    public final ImageView f48303r;
    public f f48304s;
    public TLRPC.Chat v;
    public boolean f48305w;

    public g(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        float f7;
        float f10;
        float f11;
        this.d.setTypeface(AndroidUtilities.bold());
        ImageView imageView = new ImageView(context);
        this.f48303r = imageView;
        imageView.setFocusable(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(i6.f0(i6.w0(null, i6.Vh, false), 1, -1));
        imageView.setImageResource(R.drawable.poll_remove);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.f20988m6, false), PorterDuff.Mode.MULTIPLY));
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
        addView(imageView, z5.d(48, 50.0f, i11, f7, 0.0f, f10, 0.0f));
        ai.z5 z5Var = this.d;
        if (LocaleController.isRTL) {
            f11 = 24.0f;
        } else {
            f11 = 0.0f;
        }
        z5Var.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 24.0f), 0);
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
        this.f48305w = z10;
        this.v = chat;
        h9 h9Var = this.f48285b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.f48286c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str3 = chat.title;
        ai.z5 z5Var = this.d;
        z5Var.k(Emoji.replaceEmoji(str3, z5Var.getPaint().getFontMetricsInt(), false));
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
        this.f48287e.setTextColor(i6.v0(i6.f21081r5, this.f48284a));
        setDivider(true);
        ImageView imageView = this.f48303r;
        if (z10) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        imageView.setOnClickListener(new py0(21, this, chat));
    }

    public TLRPC.Chat getChat() {
        return this.v;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f48303r.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    public void setChatDeleteListener(f fVar) {
        this.f48304s = fVar;
    }
}
