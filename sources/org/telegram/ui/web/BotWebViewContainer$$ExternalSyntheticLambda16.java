package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$ThemeDelegate$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;

public final class BotWebViewContainer$$ExternalSyntheticLambda16 implements AlertDialog.OnButtonClickListener, ResultCallback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final int f$3;
    public final Object f$4;

    public BotWebViewContainer$$ExternalSyntheticLambda16(FactCheckController factCheckController, EditTextCaption editTextCaption, int i, MessageObject messageObject, boolean z) {
        this.f$0 = factCheckController;
        this.f$1 = editTextCaption;
        this.f$3 = i;
        this.f$4 = messageObject;
        this.f$2 = z;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                ((String[]) this.f$1)[0] = null;
                alertDialog.dismiss();
                boolean z = this.f$2;
                int i2 = this.f$3;
                BotWebViewContainer.MyWebView myWebView = (BotWebViewContainer.MyWebView) this.f$4;
                if (z) {
                    MessagesController.getInstance(botWebViewContainer.currentAccount).unblockPeer(botWebViewContainer.botUser.id, new TodoItemMenu$$ExternalSyntheticLambda2(botWebViewContainer, i2, myWebView, 20));
                } else {
                    SendMessagesHelper.getInstance(botWebViewContainer.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(botWebViewContainer.currentAccount).getCurrentUser(), botWebViewContainer.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "sent");
                        BotWebViewContainer.notifyEvent(i2, myWebView, "phone_requested", jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                ((FactCheckController) this.f$0).lambda$openFactCheckEditor$8((EditTextCaption) this.f$1, this.f$3, (MessageObject) this.f$4, this.f$2, alertDialog, i);
                break;
        }
    }

    @Override
    public void onComplete(Object obj) {
        Pair pair = (Pair) obj;
        ChatActivity.ThemeDelegate themeDelegate = (ChatActivity.ThemeDelegate) this.f$0;
        themeDelegate.getClass();
        if (pair == null) {
            return;
        }
        long jLongValue = ((Long) pair.first).longValue();
        Bitmap bitmap = ((WallpaperBitmapHolder) pair.second).bitmap;
        EmojiThemes emojiThemes = themeDelegate.chatTheme;
        if (emojiThemes != null) {
            if (jLongValue != ((EmojiThemes.ThemeItem) emojiThemes.items.get(themeDelegate.isDark ? 1 : 0)).getThemeId() || bitmap == null) {
                return;
            }
            ValueAnimator valueAnimator = themeDelegate.patternIntensityAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i = ((EmojiThemes) this.f$1).getWallpaper(this.f$2 ? 1 : 0).settings.intensity;
            List list = ((WallpaperBitmapHolder) pair.second).giftPatternPositions;
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) this.f$4;
            motionBackgroundDrawable.giftPatternPositions = list;
            long j = ChatActivity.this.wallpaperRandomSeed;
            if (list != null) {
                motionBackgroundDrawable.giftPosition = new Random(j).nextInt(motionBackgroundDrawable.giftPatternPositions.size());
            }
            motionBackgroundDrawable.setPatternBitmap(bitmap, i);
            motionBackgroundDrawable.setPatternColorFilter(this.f$3);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            themeDelegate.patternIntensityAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ChatActivity$ThemeDelegate$$ExternalSyntheticLambda4(motionBackgroundDrawable, 2));
            themeDelegate.patternIntensityAnimator.setDuration(250L);
            themeDelegate.patternIntensityAnimator.start();
        }
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    public BotWebViewContainer$$ExternalSyntheticLambda16(ChatActivity.ThemeDelegate themeDelegate, EmojiThemes emojiThemes, boolean z, MotionBackgroundDrawable motionBackgroundDrawable, int i) {
        this.f$0 = themeDelegate;
        this.f$1 = emojiThemes;
        this.f$2 = z;
        this.f$4 = motionBackgroundDrawable;
        this.f$3 = i;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    public BotWebViewContainer$$ExternalSyntheticLambda16(BotWebViewContainer botWebViewContainer, String[] strArr, boolean z, int i, BotWebViewContainer.MyWebView myWebView) {
        this.f$0 = botWebViewContainer;
        this.f$1 = strArr;
        this.f$2 = z;
        this.f$3 = i;
        this.f$4 = myWebView;
    }
}
