package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$10$$ExternalSyntheticOutline0;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.ChatbotsActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.Business.LocationActivity;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Premium.boosts.cells.EnterPrizeCell;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.GradientClip;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.community.CommunityEditActivity;

public abstract class WebActionBar extends FrameLayout {
    public static final int bookmark_item = 6;
    public static final int bookmarks_item = 7;
    public static final int forward_item = 9;
    public static final int history_item = 8;
    public static final int instant_item = 10;
    public static final int open_item = 3;
    public static final int reload_item = 5;
    public static final int search_item = 1;
    public static final int settings_item = 4;
    public static final int share_item = 2;
    private ValueAnimator addressAnimator;
    public int addressBackgroundColor;
    public final Paint addressBackgroundPaint;
    public final FrameLayout addressContainer;
    public final EditTextBoldCursor addressEditText;
    public final Paint addressRoundPaint;
    public int addressTextColor;
    public boolean addressing;
    public float addressingProgress;
    public final ImageView backButton;
    public final BackDrawable backButtonDrawable;
    public final Drawable backButtonSelector;
    private boolean backButtonShown;
    private int backgroundColor;
    public final Paint[] backgroundPaint;
    public final ImageView clearButton;
    public final Drawable clearButtonSelector;
    public final GradientClip clip;
    private ValueAnimator colorAnimator;
    public boolean[] colorSet;
    public boolean drawShadow;
    public final ImageView forwardButton;
    public final ForwardDrawable forwardButtonDrawable;
    public final Drawable forwardButtonSelector;
    private int fromBackgroundColor;
    private int fromIconColor;
    public boolean hasForward;
    public boolean hasLoaded;
    public int height;
    public int iconColor;
    public boolean isLocal;
    public boolean isMenuShown;
    public boolean isTonsite;
    public final LinearLayout leftmenu;
    public final LineProgressView lineProgressView;
    public boolean longClicked;
    private Runnable longPressRunnable;
    public int menuBackgroundColor;
    public final ImageView menuButton;
    public final Drawable menuButtonSelector;
    public int menuIconColor;
    private Utilities.Callback<Integer> menuListener;
    public int menuTextColor;
    private int menuType;
    private boolean occupyStatusBar;
    private long pressTime;
    private float pressX;
    private float pressY;
    public final float[] progress;
    public final Paint[] progressBackgroundPaint;
    public final RectF rect;
    private final Theme.ResourcesProvider resourcesProvider;
    public final LinearLayout rightmenu;
    private int rippleColor;
    public float scale;
    public final Paint scrimPaint;
    private ValueAnimator searchAnimator;
    public final FrameLayout searchContainer;
    public final EditTextBoldCursor searchEditText;
    private int searchEngineIndex;
    public boolean searching;
    public float searchingProgress;
    public final Paint[] shadowPaint;
    public int textColor;
    public final TextPaint titlePaint;
    public float titleProgress;
    public final Title[] titles;
    private int toBackgroundColor;
    private Utilities.Callback<String> urlCallback;

    public final class AnonymousClass1 extends LinearLayout {
        public final int $r8$classId;

        public AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    setPivotY(0.0f);
                    setPivotX(0.0f);
                    break;
                case 1:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(600.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(800.0f)), 1073741824));
                    break;
                case 2:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                    break;
                case 3:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
                    break;
                default:
                    super.onMeasure(i, i2);
                    setPivotY(0.0f);
                    setPivotX(getMeasuredWidth());
                    break;
            }
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
                default:
                    super.onDetachedFromWindow();
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
                case 1:
                default:
                    return super.onTouchEvent(motionEvent);
                case 2:
                    if (isEnabled()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                case 3:
                    if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
            }
        }
    }

    public final class AnonymousClass7 extends AnimatorListenerAdapter {
        public final int $r8$classId = 1;
        public final View this$0;
        public final int val$backgroundColor;
        public final float val$toDark;

        public AnonymousClass7(StarsReactionsSheet.StarsSlider starsSlider, float f, int i) {
            this.this$0 = starsSlider;
            this.val$toDark = f;
            this.val$backgroundColor = i;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((WebActionBar) this.this$0).setColors(this.val$backgroundColor, this.val$toDark, false);
                    break;
                default:
                    float f = this.val$toDark;
                    StarsReactionsSheet.StarsSlider starsSlider = (StarsReactionsSheet.StarsSlider) this.this$0;
                    starsSlider.progress = f;
                    if (starsSlider.getValue() != this.val$backgroundColor) {
                        starsSlider.onValueChanged(starsSlider.getValue());
                    }
                    starsSlider.invalidate();
                    break;
            }
        }

        public AnonymousClass7(WebActionBar webActionBar, int i, float f) {
            this.this$0 = webActionBar;
            this.val$backgroundColor = i;
            this.val$toDark = f;
        }
    }

    public final class AnonymousClass8 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final WebActionBar this$0;
        public final boolean val$show;

        public AnonymousClass8(WebActionBar webActionBar, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = webActionBar;
            this.val$show = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    WebActionBar webActionBar = this.this$0;
                    if (!webActionBar.searching) {
                        webActionBar.searchEditText.setVisibility(8);
                        webActionBar.searchEditText.setText("");
                    }
                    EditTextBoldCursor editTextBoldCursor = webActionBar.searchEditText;
                    float f = this.val$show ? 1.0f : 0.0f;
                    webActionBar.searchingProgress = f;
                    editTextBoldCursor.setAlpha(f);
                    webActionBar.invalidate();
                    if (!webActionBar.searching) {
                        webActionBar.searchEditText.clearFocus();
                        AndroidUtilities.hideKeyboard(webActionBar.searchEditText);
                    } else {
                        webActionBar.searchEditText.requestFocus();
                        AndroidUtilities.showKeyboard(webActionBar.searchEditText);
                    }
                    break;
                default:
                    WebActionBar webActionBar2 = this.this$0;
                    if (!webActionBar2.addressing) {
                        webActionBar2.addressEditText.setVisibility(8);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = webActionBar2.addressEditText;
                    float f2 = this.val$show ? 1.0f : 0.0f;
                    webActionBar2.addressingProgress = f2;
                    editTextBoldCursor2.setAlpha(f2);
                    webActionBar2.onAddressingProgress(webActionBar2.addressingProgress);
                    webActionBar2.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * webActionBar2.addressingProgress);
                    webActionBar2.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * webActionBar2.addressingProgress);
                    webActionBar2.invalidate();
                    break;
            }
        }
    }

    public abstract class ForwardDrawable extends Drawable {
        public final AnimatedFloat animatedState;
        public final Paint paint;
        public final Path path = new Path();

        public ForwardDrawable() {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            this.animatedState = new AnimatedFloat(new AddressBarList$$ExternalSyntheticLambda4(this, 7), 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public final void draw(Canvas canvas) {
            float f = this.animatedState.set(true);
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
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(24.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public abstract void setState();
    }

    public final class Title {
        public final AnimatedFloat animatedDangerous;
        public boolean isDangerous;
        public final AnimatedTextView.AnimatedTextDrawable subtitle;
        public int subtitleColor;
        public final AnimatedTextView.AnimatedTextDrawable title;
        public final Drawable warningDrawable;
        public int warningDrawableColor;

        public Title() {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.title = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(true, true, true);
            this.subtitle = animatedTextDrawable2;
            this.animatedDangerous = new AnimatedFloat(WebActionBar.this, 0L, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.isDangerous = false;
            animatedTextDrawable.ignoreRTL = true;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(18.33f));
            animatedTextDrawable.setScaleProperty(0.6f);
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setEllipsizeByGradient(false);
            animatedTextDrawable.setCallback(WebActionBar.this);
            animatedTextDrawable.setOverrideFullWidth(9999999);
            animatedTextDrawable2.ignoreRTL = true;
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable2.setEllipsizeByGradient(false);
            animatedTextDrawable2.setCallback(WebActionBar.this);
            animatedTextDrawable2.setOverrideFullWidth(9999999);
            this.warningDrawable = WebActionBar.this.getContext().getResources().getDrawable(R.drawable.warning_sign).mutate();
        }

        public final void draw(Canvas canvas, float f, float f2, float f3) {
            WebActionBar webActionBar = WebActionBar.this;
            webActionBar.rect.set(0.0f, 0.0f, f, f2);
            canvas.saveLayerAlpha(webActionBar.rect, (int) (f3 * 255.0f), 31);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.title;
            float fIsNotEmpty = animatedTextDrawable.isNotEmpty();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.subtitle;
            float fIsNotEmpty2 = animatedTextDrawable2.isNotEmpty() * fIsNotEmpty;
            canvas.save();
            float f4 = 0.82f * f2;
            canvas.translate(0.0f, DiffUtil.m(1.0f, webActionBar.scale, f4, -AndroidUtilities.dp(1.0f)));
            canvas.translate(0.0f, (-AndroidUtilities.dp(4.0f)) * fIsNotEmpty2);
            float fLerp = AndroidUtilities.lerp(1.0f, 0.86f, fIsNotEmpty2) * webActionBar.scale;
            canvas.scale(fLerp, fLerp, 0.0f, 0.0f);
            animatedTextDrawable.setBounds(0.0f, 0.0f, f, f2);
            animatedTextDrawable.draw(canvas);
            canvas.restore();
            float f5 = this.animatedDangerous.set(this.isDangerous);
            canvas.save();
            canvas.translate(0.0f, BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, fIsNotEmpty2, AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(14.0f) * fIsNotEmpty2) + ((1.0f - webActionBar.scale) * f4 * fIsNotEmpty2) + (-AndroidUtilities.dp(1.0f))));
            float fLerp2 = AndroidUtilities.lerp(1.15f, 0.9f, fIsNotEmpty2) * webActionBar.scale;
            canvas.scale(fLerp2, fLerp2, 0.0f, 0.0f);
            animatedTextDrawable2.setTextColor(ColorUtils.blendARGB(f5, this.subtitleColor, Theme.getColor(null, Theme.key_text_RedBold, false)));
            if (f5 > 0.0f) {
                int i = this.warningDrawableColor;
                int textColor = animatedTextDrawable2.getTextColor();
                Drawable drawable = this.warningDrawable;
                if (i != textColor) {
                    int textColor2 = animatedTextDrawable2.getTextColor();
                    this.warningDrawableColor = textColor2;
                    drawable.setColorFilter(new PorterDuffColorFilter(textColor2, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha((int) (255.0f * f5));
                drawable.setBounds(0, ((int) (f2 - AndroidUtilities.dp(16.0f))) / 2, AndroidUtilities.dp(16.0f), ((int) (AndroidUtilities.dp(16.0f) + f2)) / 2);
                drawable.draw(canvas);
            }
            animatedTextDrawable2.setBounds(AndroidUtilities.dp(20.0f) * f5, 0.0f, f, f2);
            animatedTextDrawable2.draw(canvas);
            canvas.restore();
            webActionBar.rect.set(f - AndroidUtilities.dp(12.0f), 0.0f, f, f2);
            webActionBar.clip.draw(canvas, webActionBar.rect, 2, 1.0f);
            canvas.restore();
        }
    }

    public WebActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
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
        final int i2 = 0;
        this.isMenuShown = false;
        this.height = AndroidUtilities.dp(56.0f);
        this.scale = 1.0f;
        this.searchingProgress = 0.0f;
        this.addressingProgress = 0.0f;
        this.menuType = -1;
        this.clip = new GradientClip();
        this.longPressRunnable = new WebActionBar$$ExternalSyntheticLambda1(this, 2);
        this.longClicked = false;
        this.resourcesProvider = resourcesProvider;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.33f));
        for (int i3 = 0; i3 < 2; i3++) {
            this.backgroundPaint[i3] = new Paint(1);
            this.progressBackgroundPaint[i3] = new Paint(1);
            this.shadowPaint[i3] = new Paint(1);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, 56, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.addressContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(-1, 56, 87));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, i2);
        this.leftmenu = anonymousClass1;
        anonymousClass1.setOrientation(0);
        addView(anonymousClass1, LayoutHelper.createFrame(-2, 56, 83));
        ImageView imageView = new ImageView(context);
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
        anonymousClass1.addView(imageView, LayoutHelper.createLinear(54, 56));
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(context, 4);
        this.rightmenu = anonymousClass2;
        anonymousClass2.setOrientation(0);
        addView(anonymousClass2, LayoutHelper.createFrame(-2, 56, 85));
        ImageView imageView2 = new ImageView(context);
        this.forwardButton = imageView2;
        imageView2.setScaleType(scaleType);
        ForwardDrawable forwardDrawable = new ForwardDrawable() {
            @Override
            public final void setState() {
                invalidateSelf();
                WebActionBar.this.forwardButton.setContentDescription(LocaleController.getString(R.string.Forward));
            }
        };
        this.forwardButtonDrawable = forwardDrawable;
        imageView2.setImageDrawable(forwardDrawable);
        forwardDrawable.setState();
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable2 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.forwardButtonSelector = rippleDrawableSafeCreateSelectorDrawable2;
        imageView2.setBackground(rippleDrawableSafeCreateSelectorDrawable2);
        anonymousClass2.addView(imageView2, LayoutHelper.createLinear(54, 56));
        ImageView imageView3 = new ImageView(context);
        this.menuButton = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.ic_ab_other);
        imageView3.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_IN));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final WebActionBar f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$4(view);
                        break;
                    default:
                        this.f$0.lambda$new$7(view);
                        break;
                }
            }
        });
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable3 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.menuButtonSelector = rippleDrawableSafeCreateSelectorDrawable3;
        imageView3.setBackground(rippleDrawableSafeCreateSelectorDrawable3);
        imageView3.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        anonymousClass2.addView(imageView3, LayoutHelper.createLinear(54, 56));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, i2);
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
        anonymousClass4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final WebActionBar f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i2) {
                    case 0:
                        return this.f$0.lambda$new$5(textView, i4, keyEvent);
                    default:
                        return this.f$0.lambda$new$6(textView, i4, keyEvent);
                }
            }
        });
        anonymousClass4.addTextChangedListener(new AnonymousClass5(this, i2));
        frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1, 119));
        AnonymousClass4 anonymousClass5 = new AnonymousClass4(context, 3);
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
        anonymousClass5.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final WebActionBar f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                switch (i) {
                    case 0:
                        return this.f$0.lambda$new$5(textView, i4, keyEvent);
                    default:
                        return this.f$0.lambda$new$6(textView, i4, keyEvent);
                }
            }
        });
        frameLayout2.addView(anonymousClass5, LayoutHelper.createFrame(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.clearButton = imageView4;
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_close_white);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable4 = Theme.createSelectorDrawable(1090519039, 1, -1);
        this.clearButtonSelector = rippleDrawableSafeCreateSelectorDrawable4;
        imageView4.setBackground(rippleDrawableSafeCreateSelectorDrawable4);
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final WebActionBar f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$4(view);
                        break;
                    default:
                        this.f$0.lambda$new$7(view);
                        break;
                }
            }
        });
        addView(imageView4, LayoutHelper.createFrame(54, 56, 85));
        LineProgressView lineProgressView = new LineProgressView(context);
        this.lineProgressView = lineProgressView;
        lineProgressView.setPivotX(0.0f);
        lineProgressView.setPivotY(AndroidUtilities.dp(2.0f));
        addView(lineProgressView, LayoutHelper.createFrame(-1, 2, 87));
        setWillNotDraw(false);
        this.titles[0] = new Title();
        this.titles[1] = new Title();
        int i4 = Theme.key_iv_background;
        setColors(Theme.getColor(i4, resourcesProvider), false);
        setMenuColors(Theme.getColor(i4, resourcesProvider));
    }

    public static void lambda$new$2(ActionBarMenuSubItem actionBarMenuSubItem, WebInstantView.Loader loader) {
        actionBarMenuSubItem.setEnabled(loader.getWebPage() != null);
        actionBarMenuSubItem.animate().alpha(actionBarMenuSubItem.isEnabled() ? 1.0f : 0.5f);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        drawBackground(canvas, topPadding() + this.height, 1.0f, 1.0f, this.drawShadow);
        float right = this.leftmenu.getRight();
        float left = this.rightmenu.getLeft();
        float f = topPadding();
        float f2 = topPadding() + this.height;
        if (this.titleProgress < 1.0f) {
            canvas.save();
            float width = (getWidth() * this.titleProgress) - (Utilities.clamp01(this.titleProgress * 2.0f) * AndroidUtilities.dp(30.0f));
            canvas.translate(right + width, f);
            AndroidUtilities.lerp(1.0f, 0.5f, this.titleProgress);
            this.titles[0].draw(canvas, (left - right) - width, f2 - f, (1.0f - this.searchingProgress) * (1.0f - this.titleProgress));
            canvas.restore();
        }
        if (this.titleProgress > 0.0f) {
            float width2 = getWidth() * this.titleProgress;
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width2, getHeight());
            canvas.translate(right, f);
            canvas.translate((1.0f - this.titleProgress) * AndroidUtilities.dp(-12.0f), 0.0f);
            float fLerp = AndroidUtilities.lerp(1.0f, 0.5f, 1.0f - this.titleProgress);
            float f3 = f2 - f;
            canvas.scale(fLerp, fLerp, 0.0f, f3 / 2.0f);
            this.titles[1].draw(canvas, left - right, f3, (1.0f - this.addressingProgress) * (1.0f - this.searchingProgress) * this.titleProgress);
            canvas.restore();
        }
        if (this.addressingProgress > 0.0f) {
            int alpha = this.addressBackgroundPaint.getAlpha();
            this.addressBackgroundPaint.setAlpha((int) (alpha * this.addressingProgress));
            canvas.drawRect(0.0f, 0.0f, getWidth(), topPadding() + this.height, this.addressBackgroundPaint);
            this.addressBackgroundPaint.setAlpha(alpha);
            float f4 = (f + f2) / 2.0f;
            float fDp = AndroidUtilities.dp(42.0f) / 2.0f;
            this.rect.set(AndroidUtilities.dp(6.0f), f4 - fDp, AndroidUtilities.lerp(left, getWidth() - AndroidUtilities.dp(6.0f), this.addressingProgress), f4 + fDp);
            int alpha2 = this.addressRoundPaint.getAlpha();
            this.addressRoundPaint.setAlpha((int) (alpha2 * this.addressingProgress));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), this.addressRoundPaint);
            this.addressRoundPaint.setAlpha(alpha2);
        }
        this.rect.set(0.0f, f, getWidth(), f2);
        canvas.save();
        canvas.clipRect(this.rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.longClicked = false;
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            if (motionEvent.getX() > this.leftmenu.getRight() && motionEvent.getX() < this.rightmenu.getLeft() && !isSearching() && !isAddressing()) {
                this.pressX = motionEvent.getX();
                this.pressY = motionEvent.getY();
                this.pressTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.longPressRunnable, (long) (ViewConfiguration.getLongPressTimeout() * 0.8f));
            }
        } else if (motionEvent.getAction() == 2 && System.currentTimeMillis() - this.pressTime > ViewConfiguration.getLongPressTimeout() * 0.8f) {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.longClicked = true;
            onScrolledProgress((motionEvent.getX() - this.pressX) / (getWidth() * 0.8f));
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
            this.pressTime = 0L;
        }
        this.pressX = motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawBackground(Canvas canvas, float f, float f2, float f3, boolean z) {
        float fMax = Math.max(AndroidUtilities.dp(0.66f), 1);
        float f4 = f - fMax;
        float width = getWidth() * this.titleProgress;
        this.rect.set(0.0f, 0.0f, getWidth(), f);
        int alpha = this.backgroundPaint[1].getAlpha();
        this.backgroundPaint[1].setAlpha((int) (alpha * f2));
        canvas.drawRect(this.rect, this.backgroundPaint[1]);
        this.backgroundPaint[1].setAlpha(alpha);
        if (this.titleProgress > 0.0f) {
            this.rect.set(0.0f, 0.0f, this.progress[1] * getWidth(), f);
            int alpha2 = this.progressBackgroundPaint[1].getAlpha();
            this.progressBackgroundPaint[1].setAlpha((int) ((1.0f - this.addressingProgress) * (1.0f - this.searchingProgress) * alpha2 * f2));
            canvas.drawRect(this.rect, this.progressBackgroundPaint[1]);
            this.progressBackgroundPaint[1].setAlpha(alpha2);
            if (z) {
                this.rect.set(0.0f, f4, width, f4 + fMax);
                int alpha3 = this.shadowPaint[1].getAlpha();
                this.shadowPaint[1].setAlpha((int) ((1.0f - this.addressingProgress) * alpha3 * f2 * f3));
                canvas.drawRect(this.rect, this.shadowPaint[1]);
                this.shadowPaint[1].setAlpha(alpha3);
            }
        }
        float f5 = this.titleProgress;
        if (f5 < 1.0f) {
            this.scrimPaint.setColor(Theme.multAlpha((1.0f - f5) * f2, 1610612736));
            this.rect.set(0.0f, 0.0f, width, f);
            canvas.drawRect(this.rect, this.scrimPaint);
            this.rect.set(width, 0.0f, getWidth(), f);
            int alpha4 = this.backgroundPaint[0].getAlpha();
            this.backgroundPaint[0].setAlpha((int) (alpha4 * f2));
            canvas.drawRect(this.rect, this.backgroundPaint[0]);
            this.backgroundPaint[0].setAlpha(alpha4);
        }
        this.rect.set(width, 0.0f, (this.progress[0] * getWidth()) + width, f);
        int alpha5 = this.progressBackgroundPaint[0].getAlpha();
        this.progressBackgroundPaint[0].setAlpha((int) ((1.0f - this.addressingProgress) * (1.0f - this.searchingProgress) * (1.0f - Utilities.clamp01(this.titleProgress * 4.0f)) * alpha5 * f2));
        canvas.drawRect(this.rect, this.progressBackgroundPaint[0]);
        this.progressBackgroundPaint[0].setAlpha(alpha5);
        if (z) {
            this.rect.set(width, f4, getWidth() + width, fMax + f4);
            int alpha6 = this.shadowPaint[0].getAlpha();
            this.shadowPaint[0].setAlpha((int) ((1.0f - this.addressingProgress) * alpha6 * f2 * f3));
            canvas.drawRect(this.rect, this.shadowPaint[0]);
            this.shadowPaint[0].setAlpha(alpha6);
        }
    }

    public int getBackgroundColor(int i) {
        return this.backgroundPaint[i].getColor();
    }

    public WebInstantView.Loader getInstantViewLoader() {
        return null;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public String getTitle() {
        CharSequence text = this.titles[0].title.getText();
        return text == null ? "" : text.toString();
    }

    public void hideKeyboard() {
        if (this.searching) {
            this.searchEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }
        if (this.addressing) {
            this.addressEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.addressEditText);
        }
    }

    public boolean isAddressing() {
        return this.addressing;
    }

    public boolean isBackButton() {
        return this.backButtonShown;
    }

    public boolean isSearching() {
        return this.searching;
    }

    public final void lambda$new$0(Integer num) {
        this.menuListener.run(num);
    }

    public final Runnable lambda$new$1(Integer num) {
        return new WebActionBar$$ExternalSyntheticLambda0(4, this, num);
    }

    public final void lambda$new$11() {
        this.longClicked = true;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
    }

    public final void lambda$new$3() {
        this.isMenuShown = false;
    }

    public final void lambda$new$4(View view) {
        if (getParent() instanceof ViewGroup) {
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) getParent(), this.menuButton);
            itemOptionsMakeOptions.setDimAlpha(0);
            itemOptionsMakeOptions.setColors(this.menuTextColor, this.menuIconColor);
            itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(52.0f));
            itemOptionsMakeOptions.setMinWidth(200);
            itemOptionsMakeOptions.setSelectorColor(Theme.blendOver(this.menuBackgroundColor, Theme.multAlpha(0.1f, this.menuTextColor)));
            if (AndroidUtilities.computePerceivedBrightness(this.menuBackgroundColor) > 0.721f) {
                itemOptionsMakeOptions.setBackgroundColor(-1);
                itemOptionsMakeOptions.setGapBackgroundColor(-986896);
            } else {
                itemOptionsMakeOptions.setBackgroundColor(-14737633);
                itemOptionsMakeOptions.setGapBackgroundColor(-15592942);
            }
            int i = this.menuType;
            if (i == 0) {
                itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), lambda$new$1(3));
                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), lambda$new$1(1));
                itemOptionsMakeOptions.addIf(!this.isLocal, R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), lambda$new$1(2));
                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), lambda$new$1(4));
            } else if (i == 1) {
                if (!this.isTonsite) {
                    itemOptionsMakeOptions.add(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp), lambda$new$1(3));
                    itemOptionsMakeOptions.addGap();
                }
                if (this.hasForward) {
                    itemOptionsMakeOptions.add(R.drawable.msg_arrow_forward, LocaleController.getString(R.string.WebForward), lambda$new$1(9));
                }
                WebInstantView.Loader instantViewLoader = getInstantViewLoader();
                if (instantViewLoader != null && (((!instantViewLoader.gotRemote || !instantViewLoader.gotLocal) && instantViewLoader.remotePage == null && instantViewLoader.localPage == null && !instantViewLoader.cancelled) || instantViewLoader.getWebPage() != null)) {
                    itemOptionsMakeOptions.add(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenLocalInstantView), lambda$new$1(10));
                    ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
                    last.setEnabled(instantViewLoader.getWebPage() != null);
                    last.setAlpha(last.isEnabled() ? 1.0f : 0.5f);
                    WebActionBar$$ExternalSyntheticLambda0 webActionBar$$ExternalSyntheticLambda0 = new WebActionBar$$ExternalSyntheticLambda0(0, last, instantViewLoader);
                    instantViewLoader.listeners.add(webActionBar$$ExternalSyntheticLambda0);
                    itemOptionsMakeOptions.setOnDismiss(new WebActionBar$$ExternalSyntheticLambda0(instantViewLoader, webActionBar$$ExternalSyntheticLambda0, 7));
                }
                itemOptionsMakeOptions.add(R.drawable.msg_reset, LocaleController.getString(R.string.Refresh), lambda$new$1(5));
                itemOptionsMakeOptions.add(R.drawable.msg_search, LocaleController.getString(R.string.Search), lambda$new$1(1));
                itemOptionsMakeOptions.add(R.drawable.msg_saved, LocaleController.getString(R.string.WebBookmark), lambda$new$1(6));
                itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), lambda$new$1(2));
                itemOptionsMakeOptions.addGap();
                if (!BrowserHistory.getHistory(null).isEmpty()) {
                    itemOptionsMakeOptions.add(R.drawable.menu_views_recent, LocaleController.getString(R.string.WebHistory), lambda$new$1(8));
                }
                itemOptionsMakeOptions.add(R.drawable.menu_browser_bookmarks, LocaleController.getString(R.string.WebBookmarks), lambda$new$1(7));
                itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), lambda$new$1(4));
            }
            itemOptionsMakeOptions.setOnDismiss(new WebActionBar$$ExternalSyntheticLambda1(this, 0));
            itemOptionsMakeOptions.show();
            this.isMenuShown = true;
        }
    }

    public final boolean lambda$new$5(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchEditText);
        return false;
    }

    public final boolean lambda$new$6(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 2) {
            Utilities.Callback<String> callback = this.urlCallback;
            if (callback != null) {
                callback.run(this.addressEditText.getText().toString());
            }
            showAddress(false, true);
        }
        return false;
    }

    public final void lambda$new$7(View view) {
        this.searchEditText.setText("");
    }

    public final void lambda$setColors$8(int i, float f, float f2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        setColors(ColorUtils.blendARGB(fFloatValue, this.fromBackgroundColor, i), AndroidUtilities.lerp(f, f2, fFloatValue), false);
    }

    public final void lambda$showAddress$10(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.addressingProgress = fFloatValue;
        onAddressingProgress(fFloatValue);
        this.addressEditText.setAlpha(this.addressingProgress);
        this.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * this.addressingProgress);
        this.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * this.addressingProgress);
        invalidate();
    }

    public final void lambda$showSearch$9(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchingProgress = fFloatValue;
        this.searchEditText.setAlpha(fFloatValue);
        invalidate();
    }

    public void occupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
    }

    public abstract void onAddressColorsChanged(int i, int i2);

    public abstract void onAddressingProgress(float f);

    public abstract void onColorsUpdated();

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, ArticleViewer$10$$ExternalSyntheticOutline0.m(56.0f, topPadding(), 1073741824));
    }

    public abstract void onScrolledProgress(float f);

    public abstract void onSearchUpdated(String str);

    public void setBackButton(boolean z) {
        this.backButtonShown = z;
        if (isSearching() || isAddressing()) {
            return;
        }
        this.backButtonDrawable.setRotation(this.backButtonShown ? 0.0f : 1.0f, true);
    }

    public void setBackButtonCached(boolean z) {
        this.backButtonShown = z;
    }

    public void setBackgroundColor(int i, int i2) {
        if (this.colorSet[i] && this.backgroundPaint[i].getColor() == i2) {
            return;
        }
        this.colorSet[i] = true;
        this.backgroundPaint[i].setColor(i2);
        float f = AndroidUtilities.computePerceivedBrightness(i2) <= 0.721f ? 1.0f : 0.0f;
        int iBlendARGB = ColorUtils.blendARGB(f, -16777216, -1);
        this.progressBackgroundPaint[i].setColor(Theme.blendOver(i2, Theme.multAlpha(AndroidUtilities.lerp(0.07f, 0.2f, f), iBlendARGB)));
        this.shadowPaint[i].setColor(Theme.blendOver(i2, Theme.multAlpha(AndroidUtilities.lerp(0.14f, 0.24f, f), iBlendARGB)));
        this.titles[i].title.setTextColor(iBlendARGB);
        this.titles[i].subtitleColor = Theme.blendOver(i2, Theme.multAlpha(0.6f, iBlendARGB));
        Title title = this.titles[i];
        title.subtitle.setTextColor(ColorUtils.blendARGB(this.titles[i].animatedDangerous.get(), title.subtitleColor, Theme.getColor(null, Theme.key_text_RedBold, false)));
        invalidate();
    }

    public void setColors(int i, boolean z) {
        setColors(i, -1.0f, z);
    }

    public void setHasForward(boolean z) {
        this.hasForward = z;
    }

    public void setHeight(int i) {
        if (this.height != i) {
            this.height = i;
            float fPow = (float) Math.pow(i / AndroidUtilities.dp(56.0f), 0.5d);
            this.scale = fPow;
            this.leftmenu.setScaleX(fPow);
            this.leftmenu.setScaleY(this.scale);
            this.leftmenu.setTranslationX((1.0f - this.scale) * AndroidUtilities.dp(42.0f));
            this.leftmenu.setTranslationY((1.0f - this.scale) * AndroidUtilities.dp(-12.0f));
            this.rightmenu.setScaleX(this.scale);
            this.rightmenu.setScaleY(this.scale);
            this.rightmenu.setTranslationX((1.0f - this.scale) * (-AndroidUtilities.dp(42.0f)));
            this.rightmenu.setTranslationY((1.0f - this.scale) * AndroidUtilities.dp(-12.0f));
            this.lineProgressView.setTranslationY(this.height - AndroidUtilities.dp(56.0f));
            invalidate();
        }
    }

    public void setIsDangerous(int i, boolean z, boolean z2) {
        Title title = this.titles[i];
        if (title.isDangerous != z) {
            title.isDangerous = z;
            if (!z2) {
                title.animatedDangerous.set(z ? 1.0f : 0.0f, true);
            }
            invalidate();
        }
    }

    public void setIsLoaded(boolean z) {
        this.hasLoaded = z;
    }

    public void setIsLocal(boolean z) {
        this.isLocal = z;
    }

    public void setIsTonsite(boolean z) {
        this.isTonsite = z;
    }

    public void setMenuColors(int i) {
        boolean z = OKLCH.rgb2oklch(new double[]{((double) Color.red(i)) / 255.0d, ((double) Color.green(i)) / 255.0d, ((double) Color.blue(i)) / 255.0d})[0] < 0.5d;
        this.menuBackgroundColor = z ? -16777216 : -1;
        int i2 = z ? -1 : -16777216;
        this.menuTextColor = i2;
        this.menuIconColor = Theme.multAlpha(0.6f, i2);
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
        setProgress(0, f);
    }

    public void setSubtitle(String str, boolean z) {
        setSubtitle(0, str, z);
    }

    public void setTitle(String str, boolean z) {
        setTitle(0, str, z);
    }

    public void setTransitionProgress(float f) {
        this.titleProgress = f;
        invalidate();
    }

    public void showAddress(String str, Utilities.Callback<String> callback) {
        this.addressEditText.setText(str);
        EditTextBoldCursor editTextBoldCursor = this.addressEditText;
        editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        this.addressEditText.setScrollX(0);
        this.urlCallback = callback;
        showAddress(true, true);
    }

    public final void showAddressKeyboard() {
        if (this.addressing) {
            this.addressEditText.requestFocus();
            AndroidUtilities.showKeyboard(this.addressEditText);
        } else {
            this.addressEditText.clearFocus();
            AndroidUtilities.hideKeyboard(this.addressEditText);
        }
    }

    public void showSearch(boolean z, boolean z2) {
        boolean z3 = false;
        z3 = false;
        if (this.searching == z) {
            return;
        }
        ValueAnimator valueAnimator = this.searchAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.searching = z;
        float f = 0.0f;
        if (z2) {
            this.searchEditText.setVisibility(0);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchingProgress, z ? 1.0f : 0.0f);
            this.searchAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new WebActionBar$$ExternalSyntheticLambda2(this, 0));
            this.searchAnimator.addListener(new AnonymousClass8(this, z, z3 ? 1 : 0));
            this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.searchAnimator.setDuration(320L);
            this.searchAnimator.start();
        } else {
            this.searchingProgress = z ? 1.0f : 0.0f;
            invalidate();
            this.searchEditText.setAlpha(z ? 1.0f : 0.0f);
            this.searchEditText.setVisibility(z ? 0 : 8);
            BackDrawable backDrawable = this.backButtonDrawable;
            if (!this.backButtonShown && !z) {
                f = 1.0f;
            }
            backDrawable.setRotation(f, true);
            if (this.searching) {
                this.searchEditText.requestFocus();
                AndroidUtilities.showKeyboard(this.searchEditText);
            } else {
                this.searchEditText.clearFocus();
                AndroidUtilities.hideKeyboard(this.searchEditText);
            }
        }
        boolean z4 = !z;
        AndroidUtilities.updateViewShow(this.forwardButton, z4, true, z2);
        AndroidUtilities.updateViewShow(this.menuButton, z4, true, z2);
        ImageView imageView = this.clearButton;
        if (this.searchEditText.length() > 0 && this.searching) {
            z3 = true;
        }
        AndroidUtilities.updateViewShow(imageView, z3, true, z2);
    }

    public void swap() {
        Title[] titleArr = this.titles;
        Title title = titleArr[0];
        titleArr[0] = titleArr[1];
        titleArr[1] = title;
        float[] fArr = this.progress;
        float f = fArr[0];
        fArr[0] = fArr[1];
        fArr[1] = f;
        int backgroundColor = getBackgroundColor(0);
        setBackgroundColor(0, getBackgroundColor(1));
        setBackgroundColor(1, backgroundColor);
        invalidate();
    }

    public int topPadding() {
        if (this.occupyStatusBar) {
            return AndroidUtilities.statusBarHeight;
        }
        return 0;
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setColors(final int i, float f, boolean z) {
        boolean[] zArr = this.colorSet;
        if (zArr[2] && this.backgroundColor == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.backgroundColor;
            this.fromBackgroundColor = i2;
            final float f2 = AndroidUtilities.computePerceivedBrightness(i2) <= 0.721f ? 1.0f : 0.0f;
            final float f3 = AndroidUtilities.computePerceivedBrightness(i) > 0.721f ? 0.0f : 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setColors$8(i, f2, f3, valueAnimator2);
                }
            });
            this.colorAnimator.addListener(new AnonymousClass7(this, i, f3));
            this.colorAnimator.start();
            return;
        }
        zArr[2] = true;
        if (f < 0.0f) {
            f = AndroidUtilities.computePerceivedBrightness(i) <= 0.721f ? 1.0f : 0.0f;
        }
        int iBlendARGB = ColorUtils.blendARGB(f, -16777216, -1);
        this.textColor = iBlendARGB;
        this.iconColor = Theme.multAlpha(0.55f, iBlendARGB);
        this.backgroundColor = i;
        this.addressBackgroundColor = ColorUtils.blendARGB(f, -1, -16777216);
        int iBlendARGB2 = ColorUtils.blendARGB(1.0f - f, -1, -16777216);
        this.addressTextColor = iBlendARGB2;
        onAddressColorsChanged(this.addressBackgroundColor, iBlendARGB2);
        this.addressBackgroundPaint.setColor(this.addressBackgroundColor);
        this.addressRoundPaint.setColor(Theme.blendOver(this.addressBackgroundColor, Theme.multAlpha(AndroidUtilities.lerp(0.07f, 0.2f, f), this.textColor)));
        this.addressEditText.setHintTextColor(Theme.multAlpha(0.6f, this.addressTextColor));
        this.addressEditText.setTextColor(this.addressTextColor);
        this.addressEditText.setCursorColor(this.addressTextColor);
        this.addressEditText.setHandlesColor(this.addressTextColor);
        this.lineProgressView.setProgressColor(Theme.getColor(Theme.key_iv_ab_progress, this.resourcesProvider));
        BackDrawable backDrawable = this.backButtonDrawable;
        backDrawable.color = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
        backDrawable.invalidateSelf();
        BackDrawable backDrawable2 = this.backButtonDrawable;
        backDrawable2.rotatedColor = ColorUtils.blendARGB(this.addressingProgress, this.textColor, this.addressTextColor);
        backDrawable2.invalidateSelf();
        ForwardDrawable forwardDrawable = this.forwardButtonDrawable;
        forwardDrawable.paint.setColor(this.textColor);
        forwardDrawable.invalidateSelf();
        ImageView imageView = this.menuButton;
        int i3 = this.textColor;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(i3, mode));
        this.forwardButton.setColorFilter(new PorterDuffColorFilter(this.textColor, mode));
        this.clearButton.setColorFilter(new PorterDuffColorFilter(this.textColor, mode));
        int iBlendOver = Theme.blendOver(i, Theme.multAlpha(0.22f, this.textColor));
        this.rippleColor = iBlendOver;
        Theme.setSelectorDrawableColor(this.backButtonSelector, iBlendOver, true);
        Theme.setSelectorDrawableColor(this.forwardButtonSelector, this.rippleColor, true);
        Theme.setSelectorDrawableColor(this.menuButtonSelector, this.rippleColor, true);
        Theme.setSelectorDrawableColor(this.clearButtonSelector, this.rippleColor, true);
        this.searchEditText.setHintTextColor(Theme.multAlpha(0.6f, this.textColor));
        this.searchEditText.setTextColor(this.textColor);
        this.searchEditText.setCursorColor(this.textColor);
        this.searchEditText.setHandlesColor(this.textColor);
        onColorsUpdated();
        invalidate();
    }

    public void setProgress(int i, float f) {
        this.progress[i] = f;
        invalidate();
    }

    public void setSubtitle(int i, String str, boolean z) {
        CharSequence text = this.titles[i].subtitle.getText();
        if (text == null || !TextUtils.equals(text.toString(), str)) {
            this.titles[i].subtitle.setText(Emoji.replaceEmoji(str, this.titles[i].subtitle.getPaint().getFontMetricsInt(), false), z);
        }
    }

    public void setTitle(int i, String str, boolean z) {
        CharSequence text = this.titles[i].title.getText();
        if (text == null || !TextUtils.equals(text.toString(), str)) {
            this.titles[i].title.setText(Emoji.replaceEmoji(str, this.titles[i].title.getPaint().getFontMetricsInt(), false), z);
        }
    }

    public void showAddress(boolean z, boolean z2) {
        int i = 1;
        if (this.addressing == z) {
            return;
        }
        ValueAnimator valueAnimator = this.addressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.addressing = z;
        if (z) {
            int i2 = this.searchEngineIndex;
            int i3 = SharedConfig.searchEngineType;
            if (i2 != i3) {
                this.searchEngineIndex = i3;
                this.addressEditText.setHint(LocaleController.formatString(R.string.AddressPlaceholder, SearchEngine.getCurrent().name));
            }
        }
        float f = 0.0f;
        if (z2) {
            this.addressEditText.setVisibility(0);
            this.backButtonDrawable.setRotation((this.backButtonShown || z) ? 0.0f : 1.0f, true);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.addressingProgress, z ? 1.0f : 0.0f);
            this.addressAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new WebActionBar$$ExternalSyntheticLambda2(this, 1));
            this.addressAnimator.addListener(new AnonymousClass8(this, z, i));
            this.addressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.addressAnimator.setDuration(360L);
            this.addressAnimator.start();
        } else {
            float f2 = z ? 1.0f : 0.0f;
            this.addressingProgress = f2;
            onAddressingProgress(f2);
            invalidate();
            this.addressEditText.setAlpha(z ? 1.0f : 0.0f);
            this.addressEditText.setVisibility(z ? 0 : 8);
            this.menuButton.setTranslationX(AndroidUtilities.dp(56.0f) * this.addressingProgress);
            this.forwardButton.setTranslationX(AndroidUtilities.dp(112.0f) * this.addressingProgress);
            BackDrawable backDrawable = this.backButtonDrawable;
            if (!this.backButtonShown && !z) {
                f = 1.0f;
            }
            backDrawable.setRotation(f, true);
        }
        AndroidUtilities.cancelRunOnUIThread(new WebActionBar$$ExternalSyntheticLambda1(this, 1));
        AndroidUtilities.runOnUIThread(new WebActionBar$$ExternalSyntheticLambda1(this, 1), this.addressing ? 100L : 0L);
    }

    public final class AnonymousClass5 implements TextWatcher {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass5(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        private final void beforeTextChanged$org$telegram$ui$Components$poll$PollAddOptionFieldLayout$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$poll$sheets$CountrySelectBottomSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$community$CommunityEditActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$poll$PollAddOptionFieldLayout$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$poll$sheets$CountrySelectBottomSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$community$CommunityEditActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            switch (this.$r8$classId) {
                case 0:
                    WebActionBar webActionBar = (WebActionBar) this.this$0;
                    AndroidUtilities.updateViewShow(webActionBar.clearButton, editable.length() > 0 && webActionBar.searching, true, true);
                    webActionBar.onSearchUpdated(editable.toString());
                    break;
                case 1:
                    break;
                case 2:
                    ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.this$0;
                    chatbotsActivity.scheduledLoading = false;
                    ChatbotsActivity$$ExternalSyntheticLambda5 chatbotsActivity$$ExternalSyntheticLambda5 = chatbotsActivity.search;
                    AndroidUtilities.cancelRunOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5);
                    if (TextUtils.isEmpty(chatbotsActivity.editText.getText())) {
                        chatbotsActivity.lastQuery = null;
                        chatbotsActivity.searchHelper.clear();
                    } else {
                        chatbotsActivity.scheduledLoading = true;
                        AndroidUtilities.runOnUIThread(chatbotsActivity$$ExternalSyntheticLambda5, 800L);
                    }
                    chatbotsActivity.listView.adapter.update(true);
                    chatbotsActivity.updateSearchLoading();
                    break;
                case 3:
                    LocationActivity locationActivity = (LocationActivity) this.this$0;
                    if (!locationActivity.ignoreEditText) {
                        locationActivity.mapAddress = false;
                        locationActivity.address = editable.toString();
                        locationActivity.checkDone$2(true);
                    }
                    break;
                case 4:
                    EnterPrizeCell.AfterTextChangedListener afterTextChangedListener = ((EnterPrizeCell) this.this$0).afterTextChangedListener;
                    if (afterTextChangedListener != null) {
                        String strTrim = editable.toString().trim();
                        BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = ((BoostViaGiftsBottomSheet$$ExternalSyntheticLambda2) afterTextChangedListener).f$0;
                        boostViaGiftsBottomSheet.additionalPrize = strTrim;
                        boostViaGiftsBottomSheet.updateRows(false, false);
                        boostViaGiftsBottomSheet.updateRows(true, true);
                    }
                    break;
                case 5:
                    PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) this.this$0;
                    int length = pollAddOptionFieldLayout.textView.getText().length();
                    int i = pollAddOptionFieldLayout.maxLength;
                    pollAddOptionFieldLayout.animatorTextWarnVisibility.setValue(length > (i * 7) / 10, true);
                    pollAddOptionFieldLayout.animatorTextErrorVisibility.setValue(length > i, true);
                    pollAddOptionFieldLayout.limitTextView.setText(Integer.toString(i - length));
                    break;
                case 6:
                    CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) this.this$0;
                    countrySelectBottomSheet.saveScrollPosition();
                    countrySelectBottomSheet.query = editable.toString();
                    countrySelectBottomSheet.adapter.update(true);
                    break;
                case 7:
                    BotStarsActivity botStarsActivity = (BotStarsActivity) this.this$0;
                    TLRPC.TL_payments_starsRevenueStats starsRevenueStats = BotStarsController.getInstance(((BaseFragment) botStarsActivity).currentAccount).getStarsRevenueStats(botStarsActivity.bot_id, false);
                    long j = starsRevenueStats == null ? 0L : starsRevenueStats.status.available_balance.amount;
                    long j2 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                    botStarsActivity.balanceEditTextValue = j2;
                    if (j2 > j) {
                        botStarsActivity.balanceEditTextValue = j;
                        botStarsActivity.balanceEditTextIgnore = true;
                        botStarsActivity.balanceEditText.setText(Long.toString(j));
                        AnonymousClass4 anonymousClass4 = botStarsActivity.balanceEditText;
                        anonymousClass4.setSelection(anonymousClass4.getText().length());
                        botStarsActivity.balanceEditTextIgnore = false;
                    }
                    botStarsActivity.balanceEditTextAll = botStarsActivity.balanceEditTextValue == j;
                    BotStarsActivity$$ExternalSyntheticLambda0 botStarsActivity$$ExternalSyntheticLambda0 = botStarsActivity.setBalanceButtonText;
                    AndroidUtilities.cancelRunOnUIThread(botStarsActivity$$ExternalSyntheticLambda0);
                    botStarsActivity$$ExternalSyntheticLambda0.run();
                    if (!botStarsActivity.balanceEditTextIgnore) {
                        botStarsActivity.balanceEditTextAll = false;
                        break;
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
            switch (this.$r8$classId) {
                case 1:
                    SearchView searchView = (SearchView) this.this$0;
                    Editable text = searchView.mSearchSrcTextView.getText();
                    searchView.mUserQuery = text;
                    boolean zIsEmpty = TextUtils.isEmpty(text);
                    searchView.updateSubmitButton(!zIsEmpty);
                    int i4 = 8;
                    if (searchView.mVoiceButtonEnabled && !searchView.mIconified && zIsEmpty) {
                        searchView.mGoButton.setVisibility(8);
                        i4 = 0;
                    }
                    searchView.mVoiceButton.setVisibility(i4);
                    searchView.updateCloseButton();
                    searchView.updateSubmitArea();
                    charSequence.toString();
                    break;
            }
        }

        private final void afterTextChanged$androidx$appcompat$widget$SearchView$10(Editable editable) {
        }

        private final void beforeTextChanged$androidx$appcompat$widget$SearchView$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Business$ChatbotsActivity$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Business$LocationActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Components$Premium$boosts$cells$EnterPrizeCell$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Stars$BotStarsActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$web$WebActionBar$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Business$ChatbotsActivity$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Business$LocationActivity$3(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$Premium$boosts$cells$EnterPrizeCell$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Stars$BotStarsActivity$5(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$web$WebActionBar$5(int i, int i2, int i3, CharSequence charSequence) {
        }
    }
}
