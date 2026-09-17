package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f41783a;
    public TextView f41784b;
    public TextView f41785c;
    public j0 d;
    public LinearLayout f41786e;
    public LinearLayout f41787f;
    public int h;
    public AnimatorSet f41788n;
    public String f41789r;

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20608a7, false));
        this.fragmentView.setOnTouchListener(new ci.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41787f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41787f.setWeightSum(100.0f);
        frameLayout.addView(this.f41787f, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f41787f.addView(frameLayout2, w7.x5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.x5.c(-1.0f, -1));
        j0 j0Var = new j0(this, context, 8);
        this.d = j0Var;
        j0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
        this.f41787f.addView(this.d, w7.x5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f41786e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f41786e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.f41786e, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f41784b = textView;
        int i10 = org.telegram.ui.ActionBar.j6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f41784b.setGravity(17);
        this.f41784b.setTypeface(Typeface.MONOSPACE);
        this.f41784b.setTextSize(1, 16.0f);
        this.f41786e.addView(this.f41784b, w7.x5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f41783a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f41783a.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
        this.f41783a.setTextSize(1, 16.0f);
        this.f41783a.setLinksClickable(true);
        this.f41783a.setClickable(true);
        this.f41783a.setGravity(17);
        this.f41783a.setMovementMethod(new org.telegram.ui.Components.pv(1));
        this.f41786e.addView(this.f41783a, w7.x5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f41785c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f41785c.setGravity(17);
        this.f41785c.setTextSize(1, 32.0f);
        this.d.addView(this.f41785c, w7.x5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40();
            imageView.setImageDrawable(m40Var);
            byte[] bArr = encryptedChat.key_hash;
            m40Var.f28376a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                m40Var.f28376a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            m40Var.invalidateSelf();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr2 = encryptedChat.key_hash;
            if (bArr2.length > 16) {
                String bytesToHex = Utilities.bytesToHex(bArr2);
                for (int i11 = 0; i11 < 32; i11++) {
                    if (i11 != 0) {
                        if (i11 % 8 == 0) {
                            spannableStringBuilder.append('\n');
                        } else if (i11 % 4 == 0) {
                            spannableStringBuilder.append(' ');
                        }
                    }
                    int i12 = i11 * 2;
                    spannableStringBuilder.append((CharSequence) bytesToHex.substring(i12, i12 + 2));
                    spannableStringBuilder.append(' ');
                }
                c10 = 1;
                spannableStringBuilder.append((CharSequence) "\n");
                for (int i13 = 0; i13 < 5; i13++) {
                    byte[] bArr3 = encryptedChat.key_hash;
                    int i14 = i13 * 4;
                    int i15 = (bArr3[i14 + 19] & 255) | ((bArr3[i14 + 16] & Byte.MAX_VALUE) << 24) | ((bArr3[i14 + 17] & 255) << 16) | ((bArr3[i14 + 18] & 255) << 8);
                    if (i13 != 0) {
                        sb2.append(" ");
                    }
                    String[] strArr = EmojiData.emojiSecret;
                    sb2.append(strArr[i15 % strArr.length]);
                }
                this.f41789r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f41784b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n51(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f41783a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f41788n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41788n = null;
        }
        this.f41785c.setAlpha(0.0f);
        this.f41784b.setAlpha(1.0f);
        this.f41785c.setScaleX(0.0f);
        this.f41785c.setScaleY(0.0f);
        this.f41784b.setScaleX(1.0f);
        this.f41784b.setScaleY(1.0f);
        this.f41785c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f41785c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20664d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20608a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20938s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        TextView textView = this.f41783a;
        int i10 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f41784b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f41783a, 2, null, null, null, null, org.telegram.ui.ActionBar.j6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ei(this, 2));
    }

    @Override
    public final boolean onFragmentCreate() {
        this.h = getArguments().getInt("chat_id");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new ei(this, 2));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f41789r) != null) {
            TextView textView = this.f41785c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
