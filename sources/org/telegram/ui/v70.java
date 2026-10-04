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
public final class v70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView f41588a;
    public TextView f41589b;
    public TextView f41590c;
    public k0 d;
    public LinearLayout f41591e;
    public LinearLayout f41592f;
    public int h;
    public AnimatorSet f41593n;
    public String f41594r;

    @Override
    public final View createView(Context context) {
        char c10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.EncryptionKey));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41592f = linearLayout;
        linearLayout.setOrientation(1);
        this.f41592f.setWeightSum(100.0f);
        frameLayout.addView(this.f41592f, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f41592f.addView(frameLayout2, w7.z5.l(50.0f, -1, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        frameLayout2.addView(imageView, w7.z5.c(-1.0f, -1));
        k0 k0Var = new k0(this, context, 8);
        this.d = k0Var;
        k0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
        this.f41592f.addView(this.d, w7.z5.l(50.0f, -1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f41591e = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f41591e.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.d.addView(this.f41591e, w7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.f41589b = textView;
        int i10 = org.telegram.ui.ActionBar.i6.B6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f41589b.setGravity(17);
        this.f41589b.setTypeface(Typeface.MONOSPACE);
        this.f41589b.setTextSize(1, 16.0f);
        this.f41591e.addView(this.f41589b, w7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f41588a = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f41588a.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
        this.f41588a.setTextSize(1, 16.0f);
        this.f41588a.setLinksClickable(true);
        this.f41588a.setClickable(true);
        this.f41588a.setGravity(17);
        this.f41588a.setMovementMethod(new org.telegram.ui.Components.uv(1));
        this.f41591e.addView(this.f41588a, w7.z5.e(-2, -2, 1));
        TextView textView3 = new TextView(context);
        this.f41590c = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f41590c.setGravity(17);
        this.f41590c.setTextSize(1, 32.0f);
        this.d.addView(this.f41590c, w7.z5.c(-2.0f, -2));
        TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(this.currentAccount).getEncryptedChat(Integer.valueOf(this.h));
        if (encryptedChat != null) {
            org.telegram.ui.Components.q40 q40Var = new org.telegram.ui.Components.q40();
            imageView.setImageDrawable(q40Var);
            byte[] bArr = encryptedChat.key_hash;
            q40Var.f29897a = bArr;
            if (bArr == null) {
                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
                q40Var.f29897a = calcAuthKeyHash;
                encryptedChat.key_hash = calcAuthKeyHash;
            }
            q40Var.invalidateSelf();
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
                this.f41594r = sb2.toString();
            } else {
                c10 = 1;
            }
            this.f41589b.setText(spannableStringBuilder.toString());
            spannableStringBuilder.clear();
            int i16 = R.string.EncryptionKeyDescription;
            String str = user.first_name;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("EncryptionKeyDescription", i16, objArr)));
            int indexOf = spannableStringBuilder.toString().indexOf("telegram.org");
            if (indexOf != -1) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m61(LocaleController.getString(R.string.EncryptionKeyLink), null), indexOf, indexOf + 12, 33);
            }
            this.f41588a.setText(spannableStringBuilder);
        }
        AnimatorSet animatorSet = this.f41593n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41593n = null;
        }
        this.f41590c.setAlpha(0.0f);
        this.f41589b.setAlpha(1.0f);
        this.f41590c.setScaleX(0.0f);
        this.f41590c.setScaleY(0.0f);
        this.f41589b.setScaleX(1.0f);
        this.f41589b.setScaleY(1.0f);
        this.f41590c.setTag(Integer.valueOf(org.telegram.ui.ActionBar.i6.Me));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f41590c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        TextView textView = this.f41588a;
        int i10 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41589b, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41588a, 2, null, null, null, null, org.telegram.ui.ActionBar.i6.J6));
        return arrayList;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new g7(this, 3));
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
        this.fragmentView.getViewTreeObserver().addOnPreDrawListener(new g7(this, 3));
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        String str;
        if (z10 && !z11 && (str = this.f41594r) != null) {
            TextView textView = this.f41590c;
            textView.setText(Emoji.replaceEmoji(str, textView.getPaint().getFontMetricsInt(), false));
        }
    }
}
