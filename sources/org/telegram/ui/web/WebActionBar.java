package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda0;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.ReplaceableIconDrawable;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.GLIconSettingsView;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.PhotoPickerActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TopicCreateFragment;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.TwoStepVerificationActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public abstract class WebActionBar extends FrameLayout {
    public ValueAnimator addressAnimator;
    public int addressBackgroundColor;
    public final Paint addressBackgroundPaint;
    public final AnonymousClass4 addressEditText;
    public final Paint addressRoundPaint;
    public int addressTextColor;
    public boolean addressing;
    public float addressingProgress;
    public final ImageView backButton;
    public final BackDrawable backButtonDrawable;
    public final BaseCell.RippleDrawableSafe backButtonSelector;
    public boolean backButtonShown;
    public int backgroundColor;
    public final Paint[] backgroundPaint;
    public final ImageView clearButton;
    public final BaseCell.RippleDrawableSafe clearButtonSelector;
    public final GradientClip clip;
    public ValueAnimator colorAnimator;
    public final boolean[] colorSet;
    public boolean drawShadow;
    public final ImageView forwardButton;
    public final AnonymousClass3 forwardButtonDrawable;
    public final BaseCell.RippleDrawableSafe forwardButtonSelector;
    public int fromBackgroundColor;
    public boolean hasForward;
    public int height;
    public boolean isLocal;
    public boolean isTonsite;
    public final GLIconSettingsView leftmenu;
    public final LineProgressView lineProgressView;
    public boolean longClicked;
    public final WebActionBar$$ExternalSyntheticLambda1 longPressRunnable;
    public int menuBackgroundColor;
    public final ImageView menuButton;
    public final BaseCell.RippleDrawableSafe menuButtonSelector;
    public int menuIconColor;
    public Utilities.Callback menuListener;
    public int menuTextColor;
    public int menuType;
    public boolean occupyStatusBar;
    public long pressTime;
    public float pressX;
    public final float[] progress;
    public final Paint[] progressBackgroundPaint;
    public final RectF rect;
    public final GLIconSettingsView rightmenu;
    public int rippleColor;
    public float scale;
    public final Paint scrimPaint;
    public ValueAnimator searchAnimator;
    public final AnonymousClass4 searchEditText;
    public int searchEngineIndex;
    public boolean searching;
    public float searchingProgress;
    public final Paint[] shadowPaint;
    public int textColor;
    public final TextPaint titlePaint;
    public float titleProgress;
    public final Title[] titles;
    public ArticleViewer$$ExternalSyntheticLambda21 urlCallback;

    public final class AnonymousClass3 extends ForwardDrawable {
        public final ArticleViewer.AnonymousClass15 this$0;

        public AnonymousClass3(ArticleViewer.AnonymousClass15 anonymousClass15) {
            super(0);
            this.this$0 = anonymousClass15;
        }

        public final void setState() {
            invalidateSelf();
            this.this$0.forwardButton.setContentDescription(LocaleController.getString(R.string.Forward));
        }
    }

    public final class AnonymousClass4 extends EditTextBoldCursor {
        public final int $r8$classId;

        public AnonymousClass4(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 1:
                    super.onDetachedFromWindow();
                    AndroidUtilities.hideKeyboard(this);
                    break;
                case 2:
                default:
                    super.onDetachedFromWindow();
                    break;
                case 3:
                    super.onDetachedFromWindow();
                    AndroidUtilities.hideKeyboard(this);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                case 4:
                    if (isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                case 5:
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final View this$0;
        public final int val$backgroundColor;
        public final float val$toDark;

        public AnonymousClass7(View view, int i, float f, int i2) {
            this.$r8$classId = i2;
            this.this$0 = view;
            this.val$backgroundColor = i;
            this.val$toDark = f;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((WebActionBar) this.this$0).setColors(this.val$backgroundColor, this.val$toDark, false);
                    break;
                case 1:
                    int i = this.val$backgroundColor;
                    float f = i == 5 ? 0.0f : -this.val$toDark;
                    FilterTabsView.TabView tabView = (FilterTabsView.TabView) this.this$0;
                    tabView.shakeLockIcon(f, i + 1);
                    tabView.locIconXOffset = 0.0f;
                    tabView.invalidate();
                    break;
                default:
                    float f2 = this.val$toDark;
                    StarsReactionsSheet.StarsSlider starsSlider = (StarsReactionsSheet.StarsSlider) this.this$0;
                    starsSlider.progress = f2;
                    if (starsSlider.getValue() != this.val$backgroundColor) {
                        starsSlider.onValueChanged(starsSlider.getValue());
                    }
                    starsSlider.invalidate();
                    break;
            }
        }

        public AnonymousClass7(StarsReactionsSheet.StarsSlider starsSlider, float f, int i) {
            this.$r8$classId = 2;
            this.this$0 = starsSlider;
            this.val$toDark = f;
            this.val$backgroundColor = i;
        }
    }

    public final class Title {
        public final AnimatedFloat animatedDangerous;
        public boolean isDangerous;
        public final AnimatedTextView.AnimatedTextDrawable subtitle;
        public int subtitleColor;
        public final ArticleViewer.AnonymousClass15 this$0;
        public final AnimatedTextView.AnimatedTextDrawable title;
        public final Drawable warningDrawable;
        public int warningDrawableColor;

        public Title(ArticleViewer.AnonymousClass15 anonymousClass15) {
            this.this$0 = anonymousClass15;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.title = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true, false);
            this.subtitle = animatedTextDrawable2;
            this.animatedDangerous = new AnimatedFloat(anonymousClass15, 0L, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.isDangerous = false;
            animatedTextDrawable.ignoreRTL = true;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.33f));
            animatedTextDrawable.scaleAmplitude = 0.6f;
            animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.ellipsizeByGradient = false;
            animatedTextDrawable.invalidateSelf();
            animatedTextDrawable.setCallback(anonymousClass15);
            animatedTextDrawable.overrideFullWidth = 9999999;
            animatedTextDrawable2.ignoreRTL = true;
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable2.ellipsizeByGradient = false;
            animatedTextDrawable2.invalidateSelf();
            animatedTextDrawable2.setCallback(anonymousClass15);
            animatedTextDrawable2.overrideFullWidth = 9999999;
            this.warningDrawable = anonymousClass15.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
        }

        public final void draw(Canvas canvas, float f, float f2, float f3) {
            ArticleViewer.AnonymousClass15 anonymousClass15 = this.this$0;
            RectF rectF = anonymousClass15.rect;
            rectF.set(0.0f, 0.0f, f, f2);
            canvas.saveLayerAlpha(rectF, (int) (f3 * 255.0f), 31);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.title;
            float fIsNotEmpty = animatedTextDrawable.isNotEmpty();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.subtitle;
            float fIsNotEmpty2 = animatedTextDrawable2.isNotEmpty() * fIsNotEmpty;
            canvas.save();
            float f4 = 0.82f * f2;
            canvas.translate(0.0f, DiffUtil.m(1.0f, anonymousClass15.scale, f4, -AndroidUtilities.dp(1.0f)));
            canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * fIsNotEmpty2);
            float fLerp = AndroidUtilities.lerp(1.0f, 0.86f, fIsNotEmpty2) * anonymousClass15.scale;
            canvas.scale(fLerp, fLerp, 0.0f, 0.0f);
            animatedTextDrawable.setBounds(0.0f, 0.0f, f, f2);
            animatedTextDrawable.draw(canvas);
            canvas.restore();
            float f5 = this.animatedDangerous.set(this.isDangerous);
            canvas.save();
            canvas.translate(0.0f, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fIsNotEmpty2, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * fIsNotEmpty2) + ((1.0f - anonymousClass15.scale) * f4 * fIsNotEmpty2) + (-AndroidUtilities.dp(1.0f))));
            float fLerp2 = AndroidUtilities.lerp(1.15f, 0.9f, fIsNotEmpty2) * anonymousClass15.scale;
            canvas.scale(fLerp2, fLerp2, 0.0f, 0.0f);
            int iBlendARGB = ColorUtils.blendARGB(f5, this.subtitleColor, Theme.getColor(null, Theme.key_text_RedBold, false));
            TextPaint textPaint = animatedTextDrawable2.textPaint;
            textPaint.setColor(iBlendARGB);
            animatedTextDrawable2.alpha = Color.alpha(iBlendARGB);
            if (f5 > 0.0f) {
                int i = this.warningDrawableColor;
                int color = textPaint.getColor();
                Drawable drawable = this.warningDrawable;
                if (i != color) {
                    int color2 = textPaint.getColor();
                    this.warningDrawableColor = color2;
                    drawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha((int) (f5 * 255.0f));
                drawable.setBounds(0, ((int) (f2 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f2)) / 2);
                drawable.draw(canvas);
            }
            animatedTextDrawable2.setBounds(AndroidUtilities.dp(20.0f) * f5, 0.0f, f, f2);
            animatedTextDrawable2.draw(canvas);
            canvas.restore();
            rectF.set(f - AndroidUtilities.dp(12.0f), 0.0f, f, f2);
            anonymousClass15.clip.draw(canvas, rectF, 2, 1.0f);
            canvas.restore();
        }
    }

    public WebActionBar(Activity activity) {
        super(activity);
        this.rect = new RectF();
        this.titles = new Title[2];
        this.titleProgress = 0.0f;
        this.progress = new float[2];
        this.colorSet = new boolean[3];
        this.backgroundPaint = new Paint[2];
        this.progressBackgroundPaint = new Paint[2];
        this.shadowPaint = new Paint[2];
        final int i = 1;
        this.scrimPaint = new Paint(1);
        this.addressBackgroundPaint = new Paint(1);
        this.addressRoundPaint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.titlePaint = textPaint;
        this.height = AndroidUtilities.dp(56.0f);
        this.scale = 1.0f;
        this.searchingProgress = 0.0f;
        this.addressingProgress = 0.0f;
        this.menuType = -1;
        this.clip = new GradientClip();
        final ArticleViewer.AnonymousClass15 anonymousClass15 = (ArticleViewer.AnonymousClass15) this;
        this.longPressRunnable = new WebActionBar$$ExternalSyntheticLambda1(anonymousClass15, i);
        final int i2 = 0;
        this.longClicked = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i3 = 0; i3 < 2; i3++) {
            this.backgroundPaint[i3] = new Paint(1);
            this.progressBackgroundPaint[i3] = new Paint(1);
            this.shadowPaint[i3] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        addView(frameLayout, LayoutHelper.createFrame(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        addView(frameLayout2, LayoutHelper.createFrame(-1, 56, 87));
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(activity, 9);
        this.leftmenu = gLIconSettingsView;
        gLIconSettingsView.setOrientation(0);
        addView(gLIconSettingsView, LayoutHelper.createFrame(-2, 56, 83));
        ImageView imageView = new ImageView(activity);
        this.backButton = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        BackDrawable backDrawable = new BackDrawable(false);
        this.backButtonDrawable = backDrawable;
        backDrawable.animationTime = 200.0f;
        backDrawable.setRotation(1.0f, false);
        imageView.setImageDrawable(backDrawable);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.backButtonSelector = rippleDrawableSafeCreateSelectorDrawable;
        imageView.setBackground(rippleDrawableSafeCreateSelectorDrawable);
        gLIconSettingsView.addView(imageView, LayoutHelper.createLinear(54, 56));
        GLIconSettingsView gLIconSettingsView2 = new GLIconSettingsView(activity, 10);
        this.rightmenu = gLIconSettingsView2;
        gLIconSettingsView2.setOrientation(0);
        addView(gLIconSettingsView2, LayoutHelper.createFrame(-2, 56, 85));
        ImageView imageView2 = new ImageView(activity);
        this.forwardButton = imageView2;
        imageView2.setScaleType(scaleType);
        ArticleViewer.AnonymousClass15 anonymousClass16 = (ArticleViewer.AnonymousClass15) this;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(anonymousClass16);
        this.forwardButtonDrawable = anonymousClass3;
        imageView2.setImageDrawable(anonymousClass3);
        anonymousClass3.setState();
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable2 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.forwardButtonSelector = rippleDrawableSafeCreateSelectorDrawable2;
        imageView2.setBackground(rippleDrawableSafeCreateSelectorDrawable2);
        gLIconSettingsView2.addView(imageView2, LayoutHelper.createLinear(54, 56));
        ImageView imageView3 = new ImageView(activity);
        this.menuButton = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ArticleViewer.AnonymousClass15 anonymousClass17 = anonymousClass15;
                        if (anonymousClass17.getParent() instanceof ViewGroup) {
                            WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9 = new WebActionBar$$ExternalSyntheticLambda9(anonymousClass17, 0);
                            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) anonymousClass17.getParent(), null, anonymousClass17.menuButton);
                            itemOptionsMakeOptions.dimAlpha = 0;
                            itemOptionsMakeOptions.setColors(anonymousClass17.menuTextColor, anonymousClass17.menuIconColor);
                            itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(52.0f));
                            itemOptionsMakeOptions.minWidthDp = 200;
                            int iBlendOver = Theme.blendOver(anonymousClass17.menuBackgroundColor, Theme.multAlpha(0.1f, anonymousClass17.menuTextColor));
                            itemOptionsMakeOptions.selectorColor = Integer.valueOf(iBlendOver);
                            int i4 = 0;
                            while (i4 < itemOptionsMakeOptions.layout.getChildCount()) {
                                View childAt = i4 == itemOptionsMakeOptions.layout.getChildCount() - 1 ? itemOptionsMakeOptions.lastLayout : itemOptionsMakeOptions.layout.getChildAt(i4);
                                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                                    for (int i5 = 0; i5 < actionBarPopupWindowLayout.getItemsCount(); i5++) {
                                        View childAt2 = actionBarPopupWindowLayout.linearLayout.getChildAt(i5);
                                        if (childAt2 instanceof ActionBarMenuSubItem) {
                                            ((ActionBarMenuSubItem) childAt2).setSelectorColor(iBlendOver);
                                        }
                                    }
                                } else if (childAt instanceof ActionBarMenuSubItem) {
                                    ((ActionBarMenuSubItem) childAt).setSelectorColor(iBlendOver);
                                }
                                i4++;
                            }
                            if (AndroidUtilities.computePerceivedBrightness(anonymousClass17.menuBackgroundColor) > 0.721f) {
                                itemOptionsMakeOptions.setBackgroundColor(-1);
                                itemOptionsMakeOptions.setGapBackgroundColor(-986896);
                            } else {
                                itemOptionsMakeOptions.setBackgroundColor(-14737633);
                                itemOptionsMakeOptions.setGapBackgroundColor(-15592942);
                            }
                            int i6 = anonymousClass17.menuType;
                            if (i6 == 0) {
                                itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(3), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(1), false);
                                itemOptionsMakeOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(2), !anonymousClass17.isLocal);
                                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(4), false);
                            } else if (i6 == 1) {
                                if (!anonymousClass17.isTonsite) {
                                    itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(3), false);
                                    itemOptionsMakeOptions.addGap();
                                }
                                if (anonymousClass17.hasForward) {
                                    itemOptionsMakeOptions.add(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(9), false);
                                }
                                WebInstantView.Loader instantViewLoader = anonymousClass17.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.gotRemote || !instantViewLoader.gotLocal) && instantViewLoader.remotePage == null && instantViewLoader.localPage == null && !instantViewLoader.cancelled) || instantViewLoader.getWebPage() != null)) {
                                    itemOptionsMakeOptions.add(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(10), false);
                                    ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
                                    last.setEnabled(instantViewLoader.getWebPage() != null);
                                    last.setAlpha(last.isEnabled() ? 1.0f : 0.5f);
                                    RichTableCell$$ExternalSyntheticLambda3 richTableCell$$ExternalSyntheticLambda3 = new RichTableCell$$ExternalSyntheticLambda3(21, last, instantViewLoader);
                                    instantViewLoader.listeners.add(richTableCell$$ExternalSyntheticLambda3);
                                    itemOptionsMakeOptions.dismissListener = new RichTableCell$$ExternalSyntheticLambda3(25, instantViewLoader, richTableCell$$ExternalSyntheticLambda3);
                                }
                                itemOptionsMakeOptions.add(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(5), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(1), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(6), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(2), false);
                                itemOptionsMakeOptions.addGap();
                                if (!BrowserHistory.getHistory(null).isEmpty()) {
                                    itemOptionsMakeOptions.add(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(8), false);
                                }
                                itemOptionsMakeOptions.add(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(7), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(4), false);
                            }
                            itemOptionsMakeOptions.dismissListener = new VoIPFragment$$ExternalSyntheticLambda31(anonymousClass17, 16);
                            itemOptionsMakeOptions.show();
                            break;
                        }
                        break;
                    default:
                        anonymousClass15.searchEditText.setText("");
                        break;
                }
            }
        });
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable3 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.menuButtonSelector = rippleDrawableSafeCreateSelectorDrawable3;
        imageView3.setBackground(rippleDrawableSafeCreateSelectorDrawable3);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        gLIconSettingsView2.addView(imageView3, LayoutHelper.createLinear(54, 56));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(activity, i2);
        this.searchEditText = anonymousClass4;
        anonymousClass4.setVisibility(8);
        anonymousClass4.setAlpha(0.0f);
        anonymousClass4.setTextSize(1, 18.0f);
        anonymousClass4.setSingleLine(true);
        anonymousClass4.setHint(LocaleController.getString(R.string.Search));
        anonymousClass4.setBackgroundResource(0);
        anonymousClass4.setCursorWidth(1.5f);
        anonymousClass4.setGravity(112);
        anonymousClass4.setClipToPadding(true);
        anonymousClass4.setPadding(AndroidUtilities.dp(58.0f), 0, AndroidUtilities.dp(112.0f), 0);
        anonymousClass4.setTranslationY(-AndroidUtilities.dp(0.66f));
        anonymousClass4.setInputType(anonymousClass4.getInputType() | 524288);
        anonymousClass4.setImeOptions(33554435);
        anonymousClass4.setTextIsSelectable(false);
        anonymousClass4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        ArticleViewer.AnonymousClass15 anonymousClass17 = anonymousClass15;
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(anonymousClass17.searchEditText);
                                break;
                            }
                        }
                        break;
                    default:
                        ArticleViewer.AnonymousClass15 anonymousClass18 = anonymousClass15;
                        if (i4 == 2) {
                            ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = anonymousClass18.urlCallback;
                            if (articleViewer$$ExternalSyntheticLambda21 != null) {
                                articleViewer$$ExternalSyntheticLambda21.run(anonymousClass18.addressEditText.getText().toString());
                            }
                            anonymousClass18.showAddress(false);
                        }
                        break;
                }
                return false;
            }
        });
        anonymousClass4.addTextChangedListener(new AnonymousClass5(anonymousClass16, i2));
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1, 119));
        AnonymousClass4 anonymousClass5 = new AnonymousClass4(activity, 5);
        this.addressEditText = anonymousClass5;
        anonymousClass5.setVisibility(8);
        anonymousClass5.setAlpha(0.0f);
        anonymousClass5.setTextSize(1, 15.66f);
        anonymousClass5.setSingleLine(true);
        this.searchEngineIndex = SharedConfig.searchEngineType;
        anonymousClass5.setHint(LocaleController.formatString(R.string.AddressPlaceholder, SearchEngine.getCurrent().name));
        anonymousClass5.setBackgroundResource(0);
        anonymousClass5.setCursorWidth(1.5f);
        anonymousClass5.setGravity(112);
        anonymousClass5.setInputType(anonymousClass5.getInputType() | 524288);
        anonymousClass5.setImeOptions(33554434);
        anonymousClass5.setTextIsSelectable(false);
        anonymousClass5.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        ArticleViewer.AnonymousClass15 anonymousClass17 = anonymousClass15;
                        if (keyEvent != null) {
                            if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                                AndroidUtilities.hideKeyboard(anonymousClass17.searchEditText);
                                break;
                            }
                        }
                        break;
                    default:
                        ArticleViewer.AnonymousClass15 anonymousClass18 = anonymousClass15;
                        if (i4 == 2) {
                            ArticleViewer$$ExternalSyntheticLambda21 articleViewer$$ExternalSyntheticLambda21 = anonymousClass18.urlCallback;
                            if (articleViewer$$ExternalSyntheticLambda21 != null) {
                                articleViewer$$ExternalSyntheticLambda21.run(anonymousClass18.addressEditText.getText().toString());
                            }
                            anonymousClass18.showAddress(false);
                        }
                        break;
                }
                return false;
            }
        });
        frameLayout2.addView(anonymousClass5, LayoutHelper.createFrame(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(activity);
        this.clearButton = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable4 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.clearButtonSelector = rippleDrawableSafeCreateSelectorDrawable4;
        imageView4.setBackground(rippleDrawableSafeCreateSelectorDrawable4);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ArticleViewer.AnonymousClass15 anonymousClass17 = anonymousClass15;
                        if (anonymousClass17.getParent() instanceof ViewGroup) {
                            WebActionBar$$ExternalSyntheticLambda9 webActionBar$$ExternalSyntheticLambda9 = new WebActionBar$$ExternalSyntheticLambda9(anonymousClass17, 0);
                            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) anonymousClass17.getParent(), null, anonymousClass17.menuButton);
                            itemOptionsMakeOptions.dimAlpha = 0;
                            itemOptionsMakeOptions.setColors(anonymousClass17.menuTextColor, anonymousClass17.menuIconColor);
                            itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(52.0f));
                            itemOptionsMakeOptions.minWidthDp = 200;
                            int iBlendOver = Theme.blendOver(anonymousClass17.menuBackgroundColor, Theme.multAlpha(0.1f, anonymousClass17.menuTextColor));
                            itemOptionsMakeOptions.selectorColor = Integer.valueOf(iBlendOver);
                            int i4 = 0;
                            while (i4 < itemOptionsMakeOptions.layout.getChildCount()) {
                                View childAt = i4 == itemOptionsMakeOptions.layout.getChildCount() - 1 ? itemOptionsMakeOptions.lastLayout : itemOptionsMakeOptions.layout.getChildAt(i4);
                                if (childAt instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                                    ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) childAt;
                                    for (int i5 = 0; i5 < actionBarPopupWindowLayout.getItemsCount(); i5++) {
                                        View childAt2 = actionBarPopupWindowLayout.linearLayout.getChildAt(i5);
                                        if (childAt2 instanceof ActionBarMenuSubItem) {
                                            ((ActionBarMenuSubItem) childAt2).setSelectorColor(iBlendOver);
                                        }
                                    }
                                } else if (childAt instanceof ActionBarMenuSubItem) {
                                    ((ActionBarMenuSubItem) childAt).setSelectorColor(iBlendOver);
                                }
                                i4++;
                            }
                            if (AndroidUtilities.computePerceivedBrightness(anonymousClass17.menuBackgroundColor) > 0.721f) {
                                itemOptionsMakeOptions.setBackgroundColor(-1);
                                itemOptionsMakeOptions.setGapBackgroundColor(-986896);
                            } else {
                                itemOptionsMakeOptions.setBackgroundColor(-14737633);
                                itemOptionsMakeOptions.setGapBackgroundColor(-15592942);
                            }
                            int i6 = anonymousClass17.menuType;
                            if (i6 == 0) {
                                itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(3), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(1), false);
                                itemOptionsMakeOptions.addIf(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(2), !anonymousClass17.isLocal);
                                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(4), false);
                            } else if (i6 == 1) {
                                if (!anonymousClass17.isTonsite) {
                                    itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(3), false);
                                    itemOptionsMakeOptions.addGap();
                                }
                                if (anonymousClass17.hasForward) {
                                    itemOptionsMakeOptions.add(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(9), false);
                                }
                                WebInstantView.Loader instantViewLoader = anonymousClass17.getInstantViewLoader();
                                if (instantViewLoader != null && (((!instantViewLoader.gotRemote || !instantViewLoader.gotLocal) && instantViewLoader.remotePage == null && instantViewLoader.localPage == null && !instantViewLoader.cancelled) || instantViewLoader.getWebPage() != null)) {
                                    itemOptionsMakeOptions.add(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(10), false);
                                    ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
                                    last.setEnabled(instantViewLoader.getWebPage() != null);
                                    last.setAlpha(last.isEnabled() ? 1.0f : 0.5f);
                                    RichTableCell$$ExternalSyntheticLambda3 richTableCell$$ExternalSyntheticLambda3 = new RichTableCell$$ExternalSyntheticLambda3(21, last, instantViewLoader);
                                    instantViewLoader.listeners.add(richTableCell$$ExternalSyntheticLambda3);
                                    itemOptionsMakeOptions.dismissListener = new RichTableCell$$ExternalSyntheticLambda3(25, instantViewLoader, richTableCell$$ExternalSyntheticLambda3);
                                }
                                itemOptionsMakeOptions.add(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(5), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(1), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(6), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(2), false);
                                itemOptionsMakeOptions.addGap();
                                if (!BrowserHistory.getHistory(null).isEmpty()) {
                                    itemOptionsMakeOptions.add(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(8), false);
                                }
                                itemOptionsMakeOptions.add(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(7), false);
                                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), (Runnable) webActionBar$$ExternalSyntheticLambda9.run(4), false);
                            }
                            itemOptionsMakeOptions.dismissListener = new VoIPFragment$$ExternalSyntheticLambda31(anonymousClass17, 16);
                            itemOptionsMakeOptions.show();
                            break;
                        }
                        break;
                    default:
                        anonymousClass15.searchEditText.setText("");
                        break;
                }
            }
        });
        addView(imageView4, LayoutHelper.createFrame(54, 56, 85));
        LineProgressView lineProgressView = new LineProgressView(activity);
        this.lineProgressView = lineProgressView;
        lineProgressView.setPivotX(0.0f);
        lineProgressView.setPivotY(AndroidUtilities.dp(2.0f));
        addView(lineProgressView, LayoutHelper.createFrame(-1, 2, 87));
        setWillNotDraw(false);
        this.titles[0] = new Title(anonymousClass16);
        this.titles[1] = new Title(anonymousClass16);
        int i4 = Theme.key_iv_background;
        setColors(Theme.getColor(null, i4, false), -1.0f, false);
        setMenuColors(Theme.getColor(null, i4, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        drawBackground(canvas, (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0) + this.height, 1.0f, this.drawShadow);
        float right = this.leftmenu.getRight();
        float left = this.rightmenu.getLeft();
        boolean z = this.occupyStatusBar;
        float f = z ? AndroidUtilities.statusBarHeight : 0;
        float f2 = (z ? AndroidUtilities.statusBarHeight : 0) + this.height;
        float f3 = this.titleProgress;
        Title[] titleArr = this.titles;
        if (f3 < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.titleProgress) - (Utilities.clamp01(this.titleProgress * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f);
            AndroidUtilities.lerp(1.0f, 0.5f, this.titleProgress);
            titleArr[0].draw(canvas, (left - right) - width, f2 - f, (1.0f - this.searchingProgress) * (1.0f - this.titleProgress));
            canvas.restore();
        }
        if (this.titleProgress > 0.0f) {
            float width2 = getWidth() * this.titleProgress;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.titleProgress) * AndroidUtilities.dp(-12.0f), 0.0f);
            float fLerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.titleProgress);
            float f4 = f2 - f;
            canvas.scale(fLerp, fLerp, 0.0f, f4 / 2.0f);
            titleArr[1].draw(canvas, left - right, f4, (1.0f - this.addressingProgress) * (1.0f - this.searchingProgress) * this.titleProgress);
            canvas.restore();
        }
        float f5 = this.addressingProgress;
        RectF rectF = this.rect;
        if (f5 > 0.0f) {
            Paint paint = this.addressBackgroundPaint;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * this.addressingProgress));
            canvas.drawRect(0.0f, 0.0f, getWidth(), (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0) + this.height, paint);
            paint.setAlpha(alpha);
            float f6 = (f + f2) / 2.0f;
            float fDp = AndroidUtilities.dp(42.0f) / 2.0f;
            rectF.set(AndroidUtilities.dp(6.0f), f6 - fDp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.addressingProgress), f6 + fDp);
            Paint paint2 = this.addressRoundPaint;
            int alpha2 = paint2.getAlpha();
            paint2.setAlpha((int) (alpha2 * this.addressingProgress));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), paint2);
            paint2.setAlpha(alpha2);
        }
        rectF.set(0.0f, f, getWidth(), f2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        BotWebViewContainer.MyWebView webView;
        int action = motionEvent.getAction();
        WebActionBar$$ExternalSyntheticLambda1 webActionBar$$ExternalSyntheticLambda1 = this.longPressRunnable;
        if (action == 0) {
            this.longClicked = false;
            AndroidUtilities.cancelRunOnUIThread(webActionBar$$ExternalSyntheticLambda1);
            if (motionEvent.getX() > this.leftmenu.getRight() && motionEvent.getX() < this.rightmenu.getLeft() && !this.searching && !this.addressing) {
                this.pressX = motionEvent.getX();
                motionEvent.getY();
                this.pressTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(webActionBar$$ExternalSyntheticLambda1, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.pressTime > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(webActionBar$$ExternalSyntheticLambda1);
            this.longClicked = true;
            float x = (motionEvent.getX() - this.pressX) / (getWidth() * 0.8f);
            ArticleViewer.PageLayout pageLayout = ArticleViewer.this.pages[0];
            float fClamp01 = Utilities.clamp01(pageLayout.getProgress() + x);
            if (!pageLayout.isArticle() && pageLayout.isWeb() && (webView = pageLayout.webViewContainer.getWebView()) != null) {
                webView.setScrollProgress(fClamp01);
                ArticleViewer.this.updatePages();
            }
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(webActionBar$$ExternalSyntheticLambda1);
            this.pressTime = 0L;
        }
        this.pressX = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void drawBackground(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float fMax = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f4 = f - fMax;
        float width = getWidth() * this.titleProgress;
        float width2 = getWidth();
        RectF rectF = this.rect;
        rectF.set(0.0f, 0.0f, width2, f);
        Paint[] paintArr = this.backgroundPaint;
        int alpha = paintArr[1].getAlpha();
        paintArr[1].setAlpha((int) (alpha * 1.0f));
        canvas.drawRect(rectF, paintArr[1]);
        paintArr[1].setAlpha(alpha);
        float f5 = this.titleProgress;
        float[] fArr = this.progress;
        Paint[] paintArr2 = this.shadowPaint;
        Paint[] paintArr3 = this.progressBackgroundPaint;
        if (f5 > 0.0f) {
            rectF.set(0.0f, 0.0f, fArr[1] * getWidth(), f);
            int alpha2 = paintArr3[1].getAlpha();
            f3 = 1.0f;
            paintArr3[1].setAlpha((int) ((1.0f - this.addressingProgress) * (1.0f - this.searchingProgress) * alpha2 * 1.0f));
            canvas.drawRect(rectF, paintArr3[1]);
            paintArr3[1].setAlpha(alpha2);
            if (z) {
                rectF.set(0.0f, f4, width, f4 + fMax);
                int alpha3 = paintArr2[1].getAlpha();
                paintArr2[1].setAlpha((int) ((1.0f - this.addressingProgress) * alpha3 * 1.0f * f2));
                canvas.drawRect(rectF, paintArr2[1]);
                paintArr2[1].setAlpha(alpha3);
            }
        } else {
            f3 = 1.0f;
        }
        float f6 = this.titleProgress;
        if (f6 < f3) {
            int iMultAlpha = Theme.multAlpha((f3 - f6) * f3, 1610612736);
            Paint paint = this.scrimPaint;
            paint.setColor(iMultAlpha);
            rectF.set(0.0f, 0.0f, width, f);
            canvas.drawRect(rectF, paint);
            rectF.set(width, 0.0f, getWidth(), f);
            int alpha4 = paintArr[0].getAlpha();
            paintArr[0].setAlpha((int) (alpha4 * f3));
            canvas.drawRect(rectF, paintArr[0]);
            paintArr[0].setAlpha(alpha4);
        }
        rectF.set(width, 0.0f, (fArr[0] * getWidth()) + width, f);
        int alpha5 = paintArr3[0].getAlpha();
        paintArr3[0].setAlpha((int) ((f3 - this.addressingProgress) * (f3 - this.searchingProgress) * (f3 - Utilities.clamp01(this.titleProgress * 4.0f)) * alpha5 * f3));
        canvas.drawRect(rectF, paintArr3[0]);
        paintArr3[0].setAlpha(alpha5);
        if (z) {
            rectF.set(width, f4, getWidth() + width, fMax + f4);
            int alpha6 = paintArr2[0].getAlpha();
            paintArr2[0].setAlpha((int) ((f3 - this.addressingProgress) * alpha6 * f3 * f2));
            canvas.drawRect(rectF, paintArr2[0]);
            paintArr2[0].setAlpha(alpha6);
        }
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public WebInstantView.Loader getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public String getTitle() {
        CharSequence charSequence = this.titles[0].title.currentText;
        return charSequence == null ? "" : charSequence.toString();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, zzkm.m(56.0f, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0));
    }

    public void setBackButton(boolean z) {
        this.backButtonShown = z;
        if (this.searching || this.addressing) {
            return;
        }
        this.backButtonDrawable.setRotation(z ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z) {
        this.backButtonShown = z;
    }

    public final void setBackgroundColor(int i, int i2) {
        boolean[] zArr = this.colorSet;
        boolean z = zArr[i];
        Paint[] paintArr = this.backgroundPaint;
        if (z && paintArr[i].getColor() == i2) {
            return;
        }
        zArr[i] = true;
        paintArr[i].setColor(i2);
        float f = AndroidUtilities.computePerceivedBrightness(i2) <= 0.721f ? 1.0f : 0.0f;
        int iBlendARGB = ColorUtils.blendARGB(f, -16777216, -1);
        this.progressBackgroundPaint[i].setColor(Theme.blendOver(i2, Theme.multAlpha(AndroidUtilities.lerp(0.07f, 0.2f, f), iBlendARGB)));
        this.shadowPaint[i].setColor(Theme.blendOver(i2, Theme.multAlpha(AndroidUtilities.lerp(0.14f, 0.24f, f), iBlendARGB)));
        Title[] titleArr = this.titles;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = titleArr[i].title;
        animatedTextDrawable.textPaint.setColor(iBlendARGB);
        animatedTextDrawable.alpha = Color.alpha(iBlendARGB);
        titleArr[i].subtitleColor = Theme.blendOver(i2, Theme.multAlpha(0.6f, iBlendARGB));
        Title title = titleArr[i];
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = title.subtitle;
        int iBlendARGB2 = ColorUtils.blendARGB(titleArr[i].animatedDangerous.value, title.subtitleColor, Theme.getColor(null, Theme.key_text_RedBold, false));
        animatedTextDrawable2.textPaint.setColor(iBlendARGB2);
        animatedTextDrawable2.alpha = Color.alpha(iBlendARGB2);
        invalidate();
    }

    public final void setColors(final int i, float f, boolean z) {
        int i2 = 0;
        boolean[] zArr = this.colorSet;
        if (zArr[2] && this.backgroundColor == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i3 = this.backgroundColor;
            this.fromBackgroundColor = i3;
            final float f2 = AndroidUtilities.computePerceivedBrightness(i3) <= 0.721f ? 1.0f : 0.0f;
            final float f3 = AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    WebActionBar webActionBar = this.f$0;
                    webActionBar.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    webActionBar.setColors(ColorUtils.blendARGB(fFloatValue, webActionBar.fromBackgroundColor, i), AndroidUtilities.lerp(f2, f3, fFloatValue), false);
                }
            });
            this.colorAnimator.addListener(new AnonymousClass7(this, i, f3, i2));
            this.colorAnimator.start();
            return;
        }
        zArr[2] = true;
        if (f < 0.0f) {
            f = AndroidUtilities.computePerceivedBrightness(i) <= 0.721f ? 1.0f : 0.0f;
        }
        int iBlendARGB = ColorUtils.blendARGB(f, -16777216, -1);
        this.textColor = iBlendARGB;
        Theme.multAlpha(0.55f, iBlendARGB);
        this.backgroundColor = i;
        this.addressBackgroundColor = ColorUtils.blendARGB(f, -1, -16777216);
        int iBlendARGB2 = ColorUtils.blendARGB(1.0f - f, -1, -16777216);
        this.addressTextColor = iBlendARGB2;
        int i4 = this.addressBackgroundColor;
        ArticleViewer articleViewer = ArticleViewer.this;
        AddressBarList addressBarList = articleViewer.addressBarList;
        if (addressBarList != null) {
            addressBarList.setColors(i4, iBlendARGB2);
        }
        this.addressBackgroundPaint.setColor(this.addressBackgroundColor);
        this.addressRoundPaint.setColor(Theme.blendOver(this.addressBackgroundColor, Theme.multAlpha(AndroidUtilities.lerp(0.07f, 0.2f, f), this.textColor)));
        int iMultAlpha = Theme.multAlpha(0.6f, this.addressTextColor);
        AnonymousClass4 anonymousClass4 = this.addressEditText;
        anonymousClass4.setHintTextColor(iMultAlpha);
        anonymousClass4.setTextColor(this.addressTextColor);
        anonymousClass4.setCursorColor(this.addressTextColor);
        anonymousClass4.setHandlesColor(this.addressTextColor);
        this.lineProgressView.setProgressColor(Theme.getColor(null, Theme.key_iv_ab_progress, false));
        int iBlendARGB3 = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
        BackDrawable backDrawable = this.backButtonDrawable;
        backDrawable.color = iBlendARGB3;
        backDrawable.invalidateSelf();
        backDrawable.rotatedColor = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
        backDrawable.invalidateSelf();
        int i5 = this.textColor;
        AnonymousClass3 anonymousClass3 = this.forwardButtonDrawable;
        anonymousClass3.paint.setColor(i5);
        anonymousClass3.invalidateSelf();
        int i6 = this.textColor;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.menuButton.setColorFilter(new PorterDuffColorFilter(i6, mode));
        this.forwardButton.setColorFilter(new PorterDuffColorFilter(this.textColor, mode));
        this.clearButton.setColorFilter(new PorterDuffColorFilter(this.textColor, mode));
        int iBlendOver = Theme.blendOver(i, Theme.multAlpha(0.22f, this.textColor));
        this.rippleColor = iBlendOver;
        Theme.setSelectorDrawableColor(this.backButtonSelector, iBlendOver, true);
        Theme.setSelectorDrawableColor(this.forwardButtonSelector, this.rippleColor, true);
        Theme.setSelectorDrawableColor(this.menuButtonSelector, this.rippleColor, true);
        Theme.setSelectorDrawableColor(this.clearButtonSelector, this.rippleColor, true);
        int iMultAlpha2 = Theme.multAlpha(0.6f, this.textColor);
        AnonymousClass4 anonymousClass5 = this.searchEditText;
        anonymousClass5.setHintTextColor(iMultAlpha2);
        anonymousClass5.setTextColor(this.textColor);
        anonymousClass5.setCursorColor(this.textColor);
        anonymousClass5.setHandlesColor(this.textColor);
        ArticleViewer.Sheet sheet = articleViewer.sheet;
        if (sheet != null) {
            sheet.checkNavColor();
        }
        invalidate();
    }

    public void setHasForward(boolean z) {
        this.hasForward = z;
    }

    public void setHeight(int i) {
        if (this.height != i) {
            this.height = i;
            float fPow = (float) Math.pow(i / AndroidUtilities.dp(56.0f), 0.5d);
            this.scale = fPow;
            GLIconSettingsView gLIconSettingsView = this.leftmenu;
            gLIconSettingsView.setScaleX(fPow);
            gLIconSettingsView.setScaleY(this.scale);
            gLIconSettingsView.setTranslationX((1.0f - this.scale) * AndroidUtilities.dp(42.0f));
            gLIconSettingsView.setTranslationY((1.0f - this.scale) * AndroidUtilities.dp(-12.0f));
            float f = this.scale;
            GLIconSettingsView gLIconSettingsView2 = this.rightmenu;
            gLIconSettingsView2.setScaleX(f);
            gLIconSettingsView2.setScaleY(this.scale);
            gLIconSettingsView2.setTranslationX((1.0f - this.scale) * (-AndroidUtilities.dp(42.0f)));
            gLIconSettingsView2.setTranslationY((1.0f - this.scale) * AndroidUtilities.dp(-12.0f));
            this.lineProgressView.setTranslationY(this.height - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsLoaded(boolean z) {
    }

    public void setIsLocal(boolean z) {
        this.isLocal = z;
    }

    public void setIsTonsite(boolean z) {
        this.isTonsite = z;
    }

    public void setMenuColors(int i) {
        double[] dArrMultiply = OKLCH.multiply(OKLCH.XYZtoLMS_M, OKLCH.multiply(OKLCH.toXYZ_M, new double[]{((double) Color.red(i)) / 255.0d, ((double) Color.green(i)) / 255.0d, ((double) Color.blue(i)) / 255.0d}));
        for (int i2 = 0; i2 < 3; i2++) {
            dArrMultiply[i2] = Math.cbrt(dArrMultiply[i2]);
        }
        double[] dArrMultiply2 = OKLCH.multiply(OKLCH.LMStoLab_M, dArrMultiply);
        double d = dArrMultiply2[0];
        double d2 = dArrMultiply2[1];
        double d3 = dArrMultiply2[2];
        boolean z = new double[]{d, Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d)), ((Math.abs(d2) > 2.0E-4d ? 1 : (Math.abs(d2) == 2.0E-4d ? 0 : -1)) >= 0 || (Math.abs(d3) > 2.0E-4d ? 1 : (Math.abs(d3) == 2.0E-4d ? 0 : -1)) >= 0) ? ((((Math.atan2(d3, d2) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d : Double.NaN}[0] < 0.5d;
        this.menuBackgroundColor = z ? -16777216 : -1;
        int i3 = z ? -1 : -16777216;
        this.menuTextColor = i3;
        this.menuIconColor = Theme.multAlpha(0.6f, i3);
    }

    public void setMenuListener(Utilities.Callback<Integer> callback) {
        this.menuListener = callback;
    }

    public void setMenuType(int i) {
        if (this.menuType != i) {
            this.menuType = i;
        }
    }

    public void setProgress(float f) {
        this.progress[0] = f;
        invalidate();
    }

    public final void setSubtitle(int i, String str) {
        Title[] titleArr = this.titles;
        CharSequence charSequence = titleArr[i].subtitle.currentText;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            titleArr[i].subtitle.setText(Emoji.replaceEmoji(str, titleArr[i].subtitle.textPaint.getFontMetricsInt(), false), false, true);
        }
    }

    public final void setTitle(int i, String str, boolean z) {
        Title[] titleArr = this.titles;
        CharSequence charSequence = titleArr[i].title.currentText;
        if (charSequence == null || !TextUtils.equals(charSequence.toString(), str)) {
            titleArr[i].title.setText(Emoji.replaceEmoji(str, titleArr[i].title.textPaint.getFontMetricsInt(), false), z, true);
        }
    }

    public void setTransitionProgress(float f) {
        this.titleProgress = f;
        invalidate();
    }

    public final void showSearch(boolean z) {
        boolean z2 = false;
        if (this.searching == z) {
            return;
        }
        ValueAnimator valueAnimator = this.searchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.searching = z;
        AnonymousClass4 anonymousClass4 = this.searchEditText;
        anonymousClass4.setVisibility(0);
        this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchingProgress, z ? 1.0f : 0.0f);
        this.searchAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 28));
        this.searchAnimator.addListener(new TodoItemMenu.AnonymousClass15(17, this, z));
        this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.searchAnimator.setDuration(320L);
        this.searchAnimator.start();
        boolean z3 = !z;
        AndroidUtilities.updateViewShow(this.forwardButton, z3, true, true);
        AndroidUtilities.updateViewShow(this.menuButton, z3, true, true);
        if (anonymousClass4.length() > 0 && this.searching) {
            z2 = true;
        }
        AndroidUtilities.updateViewShow(this.clearButton, z2, true, true);
    }

    public final void swap() {
        Title[] titleArr = this.titles;
        Title title = titleArr[0];
        titleArr[0] = titleArr[1];
        titleArr[1] = title;
        float[] fArr = this.progress;
        float f = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f;
        Paint[] paintArr = this.backgroundPaint;
        int color = paintArr[0].getColor();
        setBackgroundColor(0, paintArr[1].getColor());
        setBackgroundColor(1, color);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public abstract class ForwardDrawable extends Drawable {
        public final int $r8$classId;
        public final Object animatedState;
        public final Paint paint;
        public final Path path;

        public ForwardDrawable(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    Paint paint = new Paint(1);
                    this.paint = paint;
                    paint.setColor(-1);
                    this.animatedState = new RectF();
                    this.path = new Path();
                    break;
                default:
                    this.path = new Path();
                    Paint paint2 = new Paint(1);
                    this.paint = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeJoin(Paint.Join.ROUND);
                    paint2.setStrokeCap(Paint.Cap.ROUND);
                    this.animatedState = new AnimatedFloat(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 25), 350L, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
                    break;
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    float f = ((AnimatedFloat) this.animatedState).set(true);
                    float fCenterX = getBounds().centerX();
                    float fCenterY = getBounds().centerY();
                    float fWidth = getBounds().width();
                    float f2 = 0.57f * fWidth;
                    Path path = this.path;
                    path.rewind();
                    float f3 = f2 / 2.0f;
                    path.moveTo(fCenterX - AndroidUtilities.lerp(f3, (-f2) / 2.0f, f), fCenterY);
                    float f4 = f3 + fCenterX;
                    path.lineTo(f4, fCenterY);
                    float f5 = f4 - (0.27f * fWidth);
                    float f6 = (0.54f * fWidth) / 2.0f;
                    path.moveTo(f5, fCenterY - f6);
                    path.lineTo(f4, fCenterY);
                    path.lineTo(f5, f6 + fCenterY);
                    canvas.save();
                    Paint paint = this.paint;
                    paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    canvas.translate(0.0f, (-fWidth) * 0.1f * f);
                    canvas.rotate(f * 90.0f, fCenterX, fCenterY);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                    break;
                default:
                    updatePath();
                    canvas.drawPath(this.path, this.paint);
                    break;
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(24.0f);
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(24.0f);
                default:
                    return super.getIntrinsicWidth();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
            }
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            int i2 = this.$r8$classId;
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        public abstract void updatePath();

        private final void setAlpha$org$telegram$ui$Cells$ChatMessageCell$MaskDrawable(int i) {
        }

        private final void setAlpha$org$telegram$ui$web$WebActionBar$ForwardDrawable(int i) {
        }

        private final void setColorFilter$org$telegram$ui$Cells$ChatMessageCell$MaskDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$web$WebActionBar$ForwardDrawable(ColorFilter colorFilter) {
        }
    }

    public final class AnonymousClass5 implements TextWatcher {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass5(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void beforeTextChanged$org$telegram$ui$community$CommunityEditActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$community$CommunityEditActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            switch (this.$r8$classId) {
                case 0:
                    ArticleViewer.AnonymousClass15 anonymousClass15 = (ArticleViewer.AnonymousClass15) this.this$0;
                    AndroidUtilities.updateViewShow(anonymousClass15.clearButton, editable.length() > 0 && anonymousClass15.searching, true, true);
                    String lowerCase = editable.toString().toLowerCase();
                    ArticleViewer articleViewer = ArticleViewer.this;
                    ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = articleViewer.searchRunnable;
                    if (chatActivity$$ExternalSyntheticLambda17 != null) {
                        AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda17);
                        articleViewer.searchRunnable = null;
                    }
                    if (!TextUtils.isEmpty(lowerCase)) {
                        int i = articleViewer.lastSearchIndex + 1;
                        articleViewer.lastSearchIndex = i;
                        if (!articleViewer.pages[0].isWeb()) {
                            ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda18 = new ChatActivity$$ExternalSyntheticLambda17(articleViewer, lowerCase, i, 8);
                            articleViewer.searchRunnable = chatActivity$$ExternalSyntheticLambda18;
                            AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda18, 400L);
                        } else {
                            articleViewer.showSearchPanel(true);
                            if (articleViewer.pages[0].getWebView() != null) {
                                BotWebViewContainer.MyWebView webView = articleViewer.pages[0].getWebView();
                                webView.searchListener = new ArticleViewer$$ExternalSyntheticLambda0(articleViewer, 8);
                                webView.findAllAsync(lowerCase);
                                articleViewer.updateSearchButtons();
                            }
                        }
                    } else {
                        articleViewer.searchResults.clear();
                        articleViewer.searchText = lowerCase;
                        articleViewer.pages[0].adapter.searchTextOffset.clear();
                        articleViewer.showSearchPanel(false);
                        if (!articleViewer.pages[0].isWeb()) {
                            articleViewer.pages[0].listView.invalidateViews();
                            articleViewer.scrollToSearchIndex(0);
                        } else if (articleViewer.pages[0].getWebView() != null) {
                            BotWebViewContainer.MyWebView webView2 = articleViewer.pages[0].getWebView();
                            webView2.searchListener = new ArticleViewer$$ExternalSyntheticLambda0(articleViewer, 8);
                            webView2.findAllAsync("");
                            articleViewer.updateSearchButtons();
                        }
                        articleViewer.lastSearchIndex = -1;
                    }
                    break;
                case 1:
                    PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate = ((PhotoPickerActivity) this.this$0).delegate;
                    if (photoPickerActivityDelegate != null) {
                        photoPickerActivityDelegate.onCaptionChanged(editable);
                    }
                    break;
                case 2:
                    SelectAnimatedEmojiDialog.AnonymousClass18 anonymousClass18 = (SelectAnimatedEmojiDialog.AnonymousClass18) this.this$0;
                    String string = (anonymousClass18.input.getText() == null || AndroidUtilities.trim(anonymousClass18.input.getText(), null).length() == 0) ? null : anonymousClass18.input.getText().toString();
                    ((SelectAnimatedEmojiDialog.SearchBox) anonymousClass18).this$0.search(string, true, true);
                    SelectAnimatedEmojiDialog.SearchBox.AnonymousClass5 anonymousClass5 = anonymousClass18.categoriesListView;
                    if (anonymousClass5 != null) {
                        anonymousClass5.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                        anonymousClass18.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(string), true);
                    }
                    AuctionBidSheet.AnonymousClass4 anonymousClass4 = anonymousClass18.input;
                    if (anonymousClass4 != null) {
                        anonymousClass4.clearAnimation();
                        anonymousClass18.input.animate().translationX(0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                    }
                    anonymousClass18.showInputBoxGradient(false);
                    break;
                case 3:
                    BotStarsActivity botStarsActivity = (BotStarsActivity) this.this$0;
                    TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(((BaseFragment) botStarsActivity).currentAccount).getStarsRevenueStats(botStarsActivity.bot_id, false);
                    long j = starsRevenueStats == null ? 0L : starsRevenueStats.status.available_balance.amount;
                    long j2 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                    botStarsActivity.balanceEditTextValue = j2;
                    if (j2 > j) {
                        botStarsActivity.balanceEditTextValue = j;
                        botStarsActivity.balanceEditTextIgnore = true;
                        botStarsActivity.balanceEditText.setText(Long.toString(j));
                        AnonymousClass4 anonymousClass6 = botStarsActivity.balanceEditText;
                        anonymousClass6.setSelection(anonymousClass6.getText().length());
                        botStarsActivity.balanceEditTextIgnore = false;
                    }
                    botStarsActivity.balanceEditTextAll = botStarsActivity.balanceEditTextValue == j;
                    BotStarsActivity$$ExternalSyntheticLambda1 botStarsActivity$$ExternalSyntheticLambda1 = botStarsActivity.setBalanceButtonText;
                    AndroidUtilities.cancelRunOnUIThread(botStarsActivity$$ExternalSyntheticLambda1);
                    botStarsActivity$$ExternalSyntheticLambda1.run();
                    if (!botStarsActivity.balanceEditTextIgnore) {
                        botStarsActivity.balanceEditTextAll = false;
                        break;
                    }
                    break;
                case 4:
                    EmojiBottomSheet.SearchField searchField = (EmojiBottomSheet.SearchField) this.this$0;
                    if (!searchField.ignoreTextChange) {
                        searchField.updateButton(false);
                        UsersSelectActivity.AnonymousClass4 anonymousClass7 = searchField.editText;
                        String string2 = anonymousClass7.getText().toString();
                        String str = TextUtils.isEmpty(string2) ? null : string2;
                        Utilities.Callback2 callback2 = searchField.onSearchQuery;
                        if (callback2 != null) {
                            callback2.run(str, -1);
                        }
                        EmojiBottomSheet.SearchField.AnonymousClass5 anonymousClass8 = searchField.categoriesListView;
                        if (anonymousClass8 != null) {
                            anonymousClass8.selectCategory((StickerCategoriesListView.EmojiCategory) null);
                            searchField.categoriesListView.updateCategoriesShown(TextUtils.isEmpty(string2), true);
                        }
                        if (anonymousClass7 != null) {
                            anonymousClass7.animate().cancel();
                            ViewPropertyAnimator viewPropertyAnimatorTranslationX = anonymousClass7.animate().translationX(0.0f);
                            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                            viewPropertyAnimatorTranslationX.setInterpolator(cubicBezierInterpolator).start();
                            ImageView imageView = searchField.clear;
                            if (imageView != null && searchField.clearVisible != (!TextUtils.isEmpty(anonymousClass7.getText()))) {
                                searchField.clearVisible = !searchField.clearVisible;
                                imageView.animate().cancel();
                                if (searchField.clearVisible) {
                                    imageView.setVisibility(0);
                                }
                                imageView.animate().scaleX(searchField.clearVisible ? 1.0f : 0.7f).scaleY(searchField.clearVisible ? 1.0f : 0.7f).alpha(searchField.clearVisible ? 1.0f : 0.0f).withEndAction(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 7)).setInterpolator(cubicBezierInterpolator).setDuration(320L).setStartDelay(searchField.clearVisible ? 240L : 0L).start();
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    String strTrim = editable.toString().trim();
                    TopicCreateFragment topicCreateFragment = (TopicCreateFragment) this.this$0;
                    String str2 = topicCreateFragment.firstSymbol;
                    if (strTrim.length() > 0) {
                        topicCreateFragment.firstSymbol = strTrim.substring(0, 1).toUpperCase();
                    } else {
                        topicCreateFragment.firstSymbol = "";
                    }
                    if (!str2.equals(topicCreateFragment.firstSymbol)) {
                        LetterDrawable letterDrawable = new LetterDrawable(1, null);
                        letterDrawable.setTitle(topicCreateFragment.firstSymbol);
                        ReplaceableIconDrawable replaceableIconDrawable = topicCreateFragment.replaceableIconDrawable;
                        if (replaceableIconDrawable != null) {
                            replaceableIconDrawable.setIcon((Drawable) letterDrawable, true);
                        }
                    }
                    break;
                case 6:
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.this$0;
                    if (twoStepVerificationActivity.postedErrorColorTimeout) {
                        TwoStepVerificationActivity$$ExternalSyntheticLambda4 twoStepVerificationActivity$$ExternalSyntheticLambda4 = twoStepVerificationActivity.errorColorTimeout;
                        AndroidUtilities.cancelRunOnUIThread(twoStepVerificationActivity$$ExternalSyntheticLambda4);
                        twoStepVerificationActivity$$ExternalSyntheticLambda4.run();
                    }
                    break;
                default:
                    CommunityEditActivity communityEditActivity = (CommunityEditActivity) this.this$0;
                    communityEditActivity.animatorDoneVisible.setValue((communityEditActivity.canAllManageLinkedPeersOriginal == communityEditActivity.canAllManageLinkedPeers && TextUtils.equals(((AnonymousClass4) communityEditActivity.editTextCell.this$0).getText().toString(), communityEditActivity.communityNameOriginal)) ? false : true, true);
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        private final void beforeTextChanged$org$telegram$ui$PhotoPickerActivity$11(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$SelectAnimatedEmojiDialog$SearchBox$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Stars$BotStarsActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Stories$recorder$EmojiBottomSheet$SearchField$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$TopicCreateFragment$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$TwoStepVerificationActivity$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$web$WebActionBar$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$PhotoPickerActivity$11(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$SelectAnimatedEmojiDialog$SearchBox$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Stars$BotStarsActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Stories$recorder$EmojiBottomSheet$SearchField$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$TopicCreateFragment$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$TwoStepVerificationActivity$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$web$WebActionBar$5(int i, int i2, int i3, CharSequence charSequence) {
        }
    }
}
