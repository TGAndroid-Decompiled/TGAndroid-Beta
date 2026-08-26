package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity$6$$ExternalSyntheticLambda7;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class AddressBarList extends FrameLayout {
    public int backgroundColor;
    public final BookmarksList bookmarksList;
    public final FrameLayout currentContainer;
    public final BaseCell.RippleDrawableSafe currentCopyBackground;
    public final ImageView currentCopyView;
    public final ImageView currentIconView;
    public final TextView currentLinkView;
    public final TextView currentTitleView;
    public final FrameLayout currentView;
    public final BaseCell.RippleDrawableSafe currentViewBackground;
    public int grayBackgroundColor;
    public boolean hideCurrent;
    public AsyncTask lastTask;
    public int listBackgroundColor;
    public final AnonymousClass1 listView;
    public ArticleViewer$$ExternalSyntheticLambda33 onQueryClick;
    public ArticleViewer$$ExternalSyntheticLambda10 onQueryInsertClick;
    public ArticleViewer$$ExternalSyntheticLambda10 onURLClick;
    public float openProgress;
    public boolean opened;
    public final PhotoViewer.AnonymousClass14 resourceProvider;
    public int rippleColor;
    public final AnonymousClass2 space;
    public final ArrayList suggestions;
    public int textColor;

    public final class AnonymousClass2 extends View {
        public final int $r8$classId;

        public AnonymousClass2(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(6.0f), 1073741824));
                    break;
                default:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    break;
            }
        }
    }

    public final class Address2View extends FrameLayout {
        public final Paint dividerPaint;
        public final ImageView iconView;
        public final ImageView insertView;
        public boolean needDivider;
        public final TextView textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Address2View address2View = (Address2View) view;
                if (uItem.object == null) {
                    address2View.setAsShowMore((AddressBarList) uItem.object2);
                    return;
                }
                int i = uItem.intValue;
                String string = uItem.text.toString();
                View.OnClickListener onClickListener = uItem.clickCallback;
                AddressBarList addressBarList = (AddressBarList) uItem.object2;
                ImageView imageView = address2View.iconView;
                imageView.setVisibility(0);
                int i2 = addressBarList.listBackgroundColor;
                int i3 = addressBarList.textColor;
                TextView textView = address2View.textView;
                textView.setTextColor(i3);
                int iMultAlpha = Theme.multAlpha(0.6f, i3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(iMultAlpha, mode));
                ImageView imageView2 = address2View.insertView;
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.6f, i3), mode));
                imageView2.setBackground(Theme.createRadSelectorDrawable(0, Theme.multAlpha(0.15f, i3), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                imageView.setImageResource(i == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
                textView.setText(string);
                imageView2.setOnClickListener(onClickListener);
                address2View.dividerPaint.setColor(Theme.multAlpha(0.1f, addressBarList.textColor));
                address2View.needDivider = z;
                address2View.setWillNotDraw(!z);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Address2View(context);
            }
        }

        public Address2View(Context context) {
            super(context);
            this.dividerPaint = new Paint(1);
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.menu_clear_recent);
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
            ImageView imageView2 = new ImageView(context);
            this.insertView = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.menu_browser_arrowup);
            addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void setAsShowMore(AddressBarList addressBarList) {
            ImageView imageView = this.iconView;
            imageView.setImageResource(R.drawable.arrow_more);
            imageView.setColorFilter(new PorterDuffColorFilter(addressBarList.textColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final class BookmarkView extends FrameLayout implements Theme.Colorable {
        public final DialogCell.AnonymousClass3 checkBox;
        public final Paint dividerPaint;
        public final BackupImageView iconView;
        public final ImageView insertView;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtextView;
        public int textColor;
        public final LinearLayout textLayout;
        public final FrameLayout.LayoutParams textLayoutParams;
        public final TextView textView;
        public final TextView timeView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                String strDecode;
                Bitmap bitmap;
                CharSequence charSequence;
                String str;
                TLRPC.Photo photo;
                Bitmap bitmap2;
                String str2;
                BookmarkView bookmarkView = (BookmarkView) view;
                Object obj = uItem.object2;
                if (!(obj instanceof MessageObject)) {
                    if (obj instanceof BrowserHistory.Entry) {
                        BrowserHistory.Entry entry = (BrowserHistory.Entry) obj;
                        CharSequence charSequence2 = uItem.subtext;
                        String string = charSequence2 == null ? null : charSequence2.toString();
                        bookmarkView.updateColors$1();
                        if (entry == null) {
                            return;
                        }
                        String strReplace = entry.url;
                        WebMetadataCache.WebMetadata webMetadata = entry.meta;
                        TextView textView = bookmarkView.textView;
                        if (webMetadata != null && !TextUtils.isEmpty(webMetadata.title)) {
                            textView.setText(webMetadata.title);
                        } else if (webMetadata == null || TextUtils.isEmpty(webMetadata.sitename)) {
                            try {
                                String[] strArrSplit = Uri.parse(strReplace).getHost().split("\\.");
                                String str3 = strArrSplit[strArrSplit.length - 2];
                                textView.setText(str3.substring(0, 1).toUpperCase() + str3.substring(1));
                            } catch (Exception unused) {
                                textView.setText("");
                            }
                        } else {
                            textView.setText(webMetadata.sitename);
                        }
                        BackupImageView backupImageView = bookmarkView.iconView;
                        if (webMetadata == null || (bitmap = webMetadata.favicon) == null) {
                            String string2 = textView.getText() == null ? "" : textView.getText().toString();
                            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                            characterInstance.setText(string2);
                            CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.1f, bookmarkView.textColor)), new Drawable(bookmarkView, string2.isEmpty() ? "" : string2.substring(characterInstance.first(), characterInstance.next()), 1) {
                                public final int $r8$classId;
                                public final Text text;
                                public final BookmarkView this$0;

                                {
                                    this.$r8$classId = i;
                                    switch (i) {
                                        case 1:
                                            this.this$0 = bookmarkView;
                                            this.text = new Text(str, 14.0f, AndroidUtilities.bold());
                                            break;
                                        default:
                                            this.this$0 = bookmarkView;
                                            this.text = new Text(str, 14.0f, AndroidUtilities.bold());
                                            break;
                                    }
                                }

                                @Override
                                public final void draw(Canvas canvas) {
                                    switch (this.$r8$classId) {
                                        case 0:
                                            this.text.draw(getBounds().centerX() - (this.text.width / 2.0f), getBounds().centerY(), 1.0f, this.this$0.textColor, canvas);
                                            break;
                                        default:
                                            this.text.draw(getBounds().centerX() - (this.text.width / 2.0f), getBounds().centerY(), 1.0f, this.this$0.textColor, canvas);
                                            break;
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

                                private final void setAlpha$org$telegram$ui$web$AddressBarList$BookmarkView$2(int i) {
                                }

                                private final void setAlpha$org$telegram$ui$web$AddressBarList$BookmarkView$3(int i) {
                                }

                                private final void setColorFilter$org$telegram$ui$web$AddressBarList$BookmarkView$2(ColorFilter colorFilter) {
                                }

                                private final void setColorFilter$org$telegram$ui$web$AddressBarList$BookmarkView$3(ColorFilter colorFilter) {
                                }
                            });
                            int iDp = AndroidUtilities.dp(28.0f);
                            int iDp2 = AndroidUtilities.dp(28.0f);
                            combinedDrawable.backWidth = iDp;
                            combinedDrawable.backHeight = iDp2;
                            backupImageView.setImageDrawable(combinedDrawable);
                        } else {
                            backupImageView.setImageBitmap(bitmap);
                        }
                        bookmarkView.insertView.setVisibility(8);
                        try {
                            try {
                                Uri uri = Uri.parse(strReplace);
                                strReplace = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                            } catch (Exception e) {
                                FileLog.e(e);
                                strDecode = strReplace;
                            }
                        } catch (Exception e2) {
                            FileLog.e((Throwable) e2, false);
                        }
                        strDecode = URLDecoder.decode(strReplace.replaceAll("\\+", "%2b"), "UTF-8");
                        TextView textView2 = bookmarkView.subtextView;
                        textView2.setText(strDecode);
                        if (!TextUtils.isEmpty(string)) {
                            CharSequence text = textView.getText();
                            Theme.ResourcesProvider resourcesProvider = bookmarkView.resourcesProvider;
                            textView.setText(AndroidUtilities.highlightText(text, string, resourcesProvider));
                            textView2.setText(AndroidUtilities.highlightText(textView2.getText(), string, resourcesProvider));
                        }
                        textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                        textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                        bookmarkView.timeView.setText(LocaleController.getInstance().getFormatterDay().format(entry.time));
                        bookmarkView.checkBox.checkBoxBase.setChecked(-1, false, false);
                        FrameLayout.LayoutParams layoutParams = bookmarkView.textLayoutParams;
                        layoutParams.rightMargin = AndroidUtilities.dp(70.0f);
                        bookmarkView.textLayout.setLayoutParams(layoutParams);
                        bookmarkView.needDivider = z;
                        bookmarkView.setWillNotDraw(!z);
                        return;
                    }
                    return;
                }
                MessageObject messageObject = (MessageObject) obj;
                boolean z2 = uItem.accent;
                CharSequence charSequence3 = uItem.subtext;
                String string3 = charSequence3 == null ? null : charSequence3.toString();
                boolean z3 = uItem.checked;
                bookmarkView.updateColors$1();
                TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
                String link = webPage != null ? webPage.url : AddressBarList.getLink(messageObject);
                String hostAuthority = AndroidUtilities.getHostAuthority(link, true);
                if (WebMetadataCache.instance == null) {
                    WebMetadataCache.instance = new WebMetadataCache();
                }
                WebMetadataCache webMetadataCache = WebMetadataCache.instance;
                webMetadataCache.load();
                WebMetadataCache.WebMetadata webMetadata2 = (WebMetadataCache.WebMetadata) webMetadataCache.cache.get(hostAuthority);
                if (webMetadata2 == null) {
                    webMetadata2 = null;
                } else {
                    webMetadata2.time = Math.max(webMetadata2.time, System.currentTimeMillis());
                    webMetadataCache.scheduleSave();
                }
                TextView textView3 = bookmarkView.textView;
                if (webPage != null && (str2 = webPage.title) != null) {
                    textView3.setText(str2);
                } else if (webPage != null && (str = webPage.site_name) != null) {
                    textView3.setText(str);
                } else if (webMetadata2 != null && !TextUtils.isEmpty(webMetadata2.title)) {
                    textView3.setText(webMetadata2.title);
                } else if (webMetadata2 == null || TextUtils.isEmpty(webMetadata2.sitename)) {
                    try {
                        String[] strArrSplit2 = Uri.parse(link).getHost().split("\\.");
                        String str4 = strArrSplit2[strArrSplit2.length - 2];
                        textView3.setText(str4.substring(0, 1).toUpperCase() + str4.substring(1));
                    } catch (Exception unused2) {
                        charSequence = r15;
                        textView3.setText(charSequence);
                    }
                } else {
                    textView3.setText(webMetadata2.sitename);
                }
                charSequence = "";
                BackupImageView backupImageView2 = bookmarkView.iconView;
                backupImageView2.imageReceiver.clearImage();
                if (webMetadata2 != null && (bitmap2 = webMetadata2.favicon) != null) {
                    backupImageView2.setImageBitmap(bitmap2);
                } else if (webPage == null || (photo = webPage.photo) == null) {
                    String string4 = textView3.getText() == null ? charSequence : textView3.getText().toString();
                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                    characterInstance2.setText(string4);
                    CombinedDrawable combinedDrawable2 = new CombinedDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(0.1f, bookmarkView.textColor)), new Drawable(bookmarkView, string4.isEmpty() ? charSequence : string4.substring(characterInstance2.first(), characterInstance2.next()), 0) {
                        public final int $r8$classId;
                        public final Text text;
                        public final BookmarkView this$0;

                        {
                            this.$r8$classId = i;
                            switch (i) {
                                case 1:
                                    this.this$0 = bookmarkView;
                                    this.text = new Text(str, 14.0f, AndroidUtilities.bold());
                                    break;
                                default:
                                    this.this$0 = bookmarkView;
                                    this.text = new Text(str, 14.0f, AndroidUtilities.bold());
                                    break;
                            }
                        }

                        @Override
                        public final void draw(Canvas canvas) {
                            switch (this.$r8$classId) {
                                case 0:
                                    this.text.draw(getBounds().centerX() - (this.text.width / 2.0f), getBounds().centerY(), 1.0f, this.this$0.textColor, canvas);
                                    break;
                                default:
                                    this.text.draw(getBounds().centerX() - (this.text.width / 2.0f), getBounds().centerY(), 1.0f, this.this$0.textColor, canvas);
                                    break;
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

                        private final void setAlpha$org$telegram$ui$web$AddressBarList$BookmarkView$2(int i) {
                        }

                        private final void setAlpha$org$telegram$ui$web$AddressBarList$BookmarkView$3(int i) {
                        }

                        private final void setColorFilter$org$telegram$ui$web$AddressBarList$BookmarkView$2(ColorFilter colorFilter) {
                        }

                        private final void setColorFilter$org$telegram$ui$web$AddressBarList$BookmarkView$3(ColorFilter colorFilter) {
                        }
                    });
                    int iDp3 = AndroidUtilities.dp(28.0f);
                    int iDp4 = AndroidUtilities.dp(28.0f);
                    combinedDrawable2.backWidth = iDp3;
                    combinedDrawable2.backHeight = iDp4;
                    backupImageView2.setImageDrawable(combinedDrawable2);
                } else {
                    backupImageView2.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), null, null, 0, messageObject);
                }
                bookmarkView.timeView.setVisibility(8);
                bookmarkView.insertView.setVisibility(z2 ? 0 : 8);
                String link2 = webPage != null ? webPage.url : AddressBarList.getLink(messageObject);
                try {
                    try {
                        Uri uri2 = Uri.parse(link2);
                        link2 = Browser.replace(uri2, null, null, Browser.IDN_toUnicode(uri2.getHost()), null);
                    } catch (Exception e3) {
                        FileLog.e((Throwable) e3, false);
                    }
                    link2 = URLDecoder.decode(link2.replaceAll("\\+", "%2b"), "UTF-8");
                    HashMap map = BottomSheetTabs.tabs;
                    if (link2 == null) {
                        link2 = null;
                    } else {
                        int iIndexOf = link2.indexOf(35);
                        if (iIndexOf >= 0) {
                            link2 = link2.substring(0, iIndexOf + 1);
                        }
                    }
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                TextView textView4 = bookmarkView.subtextView;
                textView4.setText(link2);
                if (!TextUtils.isEmpty(string3)) {
                    CharSequence text2 = textView3.getText();
                    Theme.ResourcesProvider resourcesProvider2 = bookmarkView.resourcesProvider;
                    textView3.setText(AndroidUtilities.highlightText(text2, string3, resourcesProvider2));
                    textView4.setText(AndroidUtilities.highlightText(textView4.getText(), string3, resourcesProvider2));
                }
                textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                bookmarkView.checkBox.checkBoxBase.setChecked(-1, z3, false);
                FrameLayout.LayoutParams layoutParams2 = bookmarkView.textLayoutParams;
                layoutParams2.rightMargin = AndroidUtilities.dp(52.0f);
                bookmarkView.textLayout.setLayoutParams(layoutParams2);
                bookmarkView.needDivider = z;
                bookmarkView.setWillNotDraw(!z);
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return uItem.object2 == uItem2.object2 && TextUtils.equals(uItem.subtext, uItem2.subtext);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BookmarkView(context, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object2 == uItem2.object2 && TextUtils.isEmpty(uItem.subtext) == TextUtils.isEmpty(uItem2.subtext);
            }
        }

        public BookmarkView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.dividerPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
            ScaleStateListAnimator.apply(this, 0.03f, 1.25f);
            BackupImageView backupImageView = new BackupImageView(context);
            this.iconView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(backupImageView, LayoutHelper.createFrame(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 51));
            TextView textView2 = new TextView(context);
            this.subtextView = textView2;
            textView2.setTextSize(1, 13.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(truncateAt);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 51, 0, 3, 0, 0));
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
            this.textLayoutParams = layoutParamsCreateFrame;
            addView(linearLayout, layoutParamsCreateFrame);
            TextView textView3 = new TextView(context);
            this.timeView = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setMaxLines(1);
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(5);
            textView3.setTextAlignment(6);
            addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.insertView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.attach_arrow_right);
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
            DialogCell.AnonymousClass3 anonymousClass3 = new DialogCell.AnonymousClass3(this, getContext(), resourcesProvider, 2);
            this.checkBox = anonymousClass3;
            anonymousClass3.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            anonymousClass3.setDrawUnchecked(false);
            anonymousClass3.setDrawBackgroundAsArc(3);
            addView(anonymousClass3, LayoutHelper.createFrame(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
        }

        public void setChecked(boolean z) {
            this.checkBox.checkBoxBase.setChecked(-1, z, true);
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhite;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int color = Theme.getColor(i, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
            this.textColor = color2;
            this.textView.setTextColor(color2);
            this.subtextView.setTextColor(Theme.blendOver(color, Theme.multAlpha(0.55f, color2)));
            this.timeView.setTextColor(Theme.multAlpha(0.55f, color2));
            this.insertView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.6f, color2), PorterDuff.Mode.SRC_IN));
            this.dividerPaint.setColor(Theme.multAlpha(0.1f, color2));
            this.iconView.invalidate();
        }
    }

    public final class BookmarksList implements NotificationCenter.NotificationCenterDelegate {
        public boolean attached;
        public final int currentAccount;
        public boolean endReached;
        public boolean loading;
        public final String query;
        public final Runnable whenUpdated;
        public final ArrayList links = new ArrayList();
        public final int guid = ConnectionsManager.generateClassGuid();

        public BookmarksList(String str, int i, Runnable runnable) {
            this.currentAccount = i;
            this.query = str;
            this.whenUpdated = runnable;
        }

        public final void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            int i = this.currentAccount;
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.bookmarkAdded);
            if (TextUtils.isEmpty(this.query)) {
                load$1();
            }
        }

        public final void detach() {
            if (this.attached) {
                this.attached = false;
                int i = this.currentAccount;
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.mediaDidLoad);
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.bookmarkAdded);
                ConnectionsManager.getInstance(i).cancelRequestsForGuid(this.guid);
                this.loading = false;
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            int i3 = NotificationCenter.mediaDidLoad;
            ArrayList arrayList = this.links;
            if (i != i3) {
                if (i == NotificationCenter.bookmarkAdded) {
                    arrayList.add(0, (MessageObject) objArr[0]);
                }
            } else if (((Integer) objArr[3]).intValue() == this.guid) {
                this.loading = false;
                ArrayList arrayList2 = (ArrayList) objArr[2];
                this.endReached = ((Boolean) objArr[5]).booleanValue();
                arrayList.addAll(arrayList2);
                this.whenUpdated.run();
            }
        }

        public final void load$1() {
            ArrayList arrayList;
            if (this.loading || this.endReached) {
                return;
            }
            this.loading = true;
            int i = this.currentAccount;
            long clientUserId = UserConfig.getInstance(i).getClientUserId();
            int i2 = 0;
            int iMin = Integer.MAX_VALUE;
            while (true) {
                arrayList = this.links;
                if (i2 >= arrayList.size()) {
                    break;
                }
                iMin = Math.min(iMin, ((MessageObject) arrayList.get(i2)).getId());
                i2++;
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(i);
            int i3 = arrayList.isEmpty() ? 30 : 50;
            if (iMin == Integer.MAX_VALUE) {
                iMin = 0;
            }
            mediaDataController.loadMedia(clientUserId, i3, iMin, 0, 3, 0L, 1, this.guid, 0, null, this.query);
        }
    }

    public final class QueryEntry {
        public long lastUsage;
        public final String query;
        public double rank;

        public QueryEntry(String str, long j) {
            this.query = str;
            this.lastUsage = j;
        }
    }

    public AddressBarList(Activity activity) {
        super(activity);
        int i = UserConfig.selectedAccount;
        this.suggestions = new ArrayList();
        this.openProgress = 0.0f;
        setWillNotDraw(false);
        int i2 = UserConfig.selectedAccount;
        TodoItemMenu$$ExternalSyntheticLambda17 todoItemMenu$$ExternalSyntheticLambda17 = new TodoItemMenu$$ExternalSyntheticLambda17(this, 22);
        AddressBarList$$ExternalSyntheticLambda2 addressBarList$$ExternalSyntheticLambda2 = new AddressBarList$$ExternalSyntheticLambda2(this);
        PhotoViewer.AnonymousClass14 anonymousClass14 = new PhotoViewer.AnonymousClass14((Theme.ResourcesProvider) null);
        this.resourceProvider = anonymousClass14;
        ?? r0 = new UniversalRecyclerView(activity, i2, todoItemMenu$$ExternalSyntheticLambda17, addressBarList$$ExternalSyntheticLambda2, anonymousClass14) {
            @Override
            public final void onScrolled(int i3, int i4) {
                BookmarksList bookmarksList;
                if (canScrollVertically(1) || (bookmarksList = AddressBarList.this.bookmarksList) == null || !bookmarksList.attached) {
                    return;
                }
                bookmarksList.load$1();
            }
        };
        this.listView = r0;
        r0.adapter.applyBackground = false;
        r0.setOverScrollMode(2);
        r0.setPadding(0, 0, 0, 0);
        addView((View) r0, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.currentContainer = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.currentView = frameLayout2;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(this.grayBackgroundColor, this.rippleColor, 15, 15);
        this.currentViewBackground = rippleDrawableSafeCreateRadSelectorDrawable;
        frameLayout2.setBackground(rippleDrawableSafeCreateRadSelectorDrawable);
        ScaleStateListAnimator.apply(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.currentIconView = imageView;
        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.currentCopyView = imageView2;
        ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable2 = Theme.createRadSelectorDrawable(0, 0, 6, 6);
        this.currentCopyBackground = rippleDrawableSafeCreateRadSelectorDrawable2;
        imageView2.setBackground(rippleDrawableSafeCreateRadSelectorDrawable2);
        frameLayout2.addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.currentTitleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.currentLinkView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 0));
        this.bookmarksList = new BookmarksList(null, i, new VoIPFragment$8$$ExternalSyntheticLambda1(this, 19));
        this.space = new AnonymousClass2(activity, 0);
        int i3 = Theme.key_iv_background;
        setColors(Theme.getColor(null, i3, false), AndroidUtilities.computePerceivedBrightness(Theme.getColor(null, i3, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String getLink(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                return url;
            }
        }
        return null;
    }

    public static void pushRecentSearch(Activity activity, String str) {
        SharedPreferences sharedPreferences = activity.getSharedPreferences("webhistory", 0);
        QueryEntry queryEntry = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    QueryEntry queryEntry2 = new QueryEntry(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    queryEntry2.rank = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(queryEntry2);
                }
                Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(24));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                QueryEntry queryEntry3 = (QueryEntry) arrayList.get(i2);
                if (TextUtils.equals(queryEntry3.query, str)) {
                    queryEntry = queryEntry3;
                    break;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
                return;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (queryEntry != null) {
            queryEntry.rank += Math.exp((jCurrentTimeMillis - queryEntry.lastUsage) / 2419200.0d);
        } else {
            queryEntry = new QueryEntry(str, jCurrentTimeMillis);
            arrayList.add(queryEntry);
        }
        queryEntry.lastUsage = jCurrentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; i3 < Math.min(arrayList.size(), 20); i3++) {
            QueryEntry queryEntry4 = (QueryEntry) arrayList.get(i3);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", queryEntry4.query);
            jSONObject2.put("rank", queryEntry4.rank);
            jSONObject2.put("usage", queryEntry4.lastUsage);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.openProgress);
        canvas.drawColor(this.listBackgroundColor);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.openProgress < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BookmarksList bookmarksList = this.bookmarksList;
        if (bookmarksList == null || !this.opened) {
            return;
        }
        bookmarksList.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BookmarksList bookmarksList = this.bookmarksList;
        if (bookmarksList != null) {
            bookmarksList.detach();
        }
    }

    public final void setColors(int i, int i2) {
        if (this.backgroundColor != i) {
            this.backgroundColor = i;
            invalidate();
        }
        this.textColor = i2;
        float f = AndroidUtilities.computePerceivedBrightness(i) >= 0.721f ? 0.0f : 1.0f;
        this.grayBackgroundColor = ColorUtils.blendARGB(AndroidUtilities.lerp(0.05f, 0.12f, f), i, i2);
        this.listBackgroundColor = i;
        this.rippleColor = ColorUtils.blendARGB(AndroidUtilities.lerp(0.12f, 0.22f, f), i, i2);
        int i3 = this.grayBackgroundColor;
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.currentViewBackground;
        Theme.setSelectorDrawableColor(rippleDrawableSafe, i3, false);
        Theme.setSelectorDrawableColor(rippleDrawableSafe, this.rippleColor, true);
        this.currentView.invalidate();
        this.currentTitleView.setTextColor(i2);
        this.currentLinkView.setTextColor(Theme.multAlpha(0.6f, i2));
        ImageView imageView = this.currentIconView;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.currentCopyView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        Theme.setSelectorDrawableColor(this.currentCopyBackground, Theme.multAlpha(1.5f, this.rippleColor), true);
        int iBlendOver = Theme.blendOver(i, Theme.multAlpha(0.05f, i2));
        int iBlendOver2 = Theme.blendOver(i, Theme.multAlpha(0.55f, i2));
        PhotoViewer.AnonymousClass14 anonymousClass14 = this.resourceProvider;
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_windowBackgroundWhite, this.listBackgroundColor);
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_windowBackgroundWhiteBlackText, i2);
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_graySection, iBlendOver);
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_graySectionText, iBlendOver2);
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_actionBarDefaultSubmenuBackground, Theme.multAlpha(0.2f, i2));
        ((SparseIntArray) anonymousClass14.blur).put(Theme.key_listSelector, Theme.multAlpha(AndroidUtilities.lerp(0.05f, 0.12f, f), i2));
        invalidateViews();
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.lastTask;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.lastTask = null;
        }
        ArrayList arrayList = this.suggestions;
        boolean z = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            AnonymousClass1 anonymousClass1 = this.listView;
            anonymousClass1.adapter.update(true);
            if (z != (!arrayList.isEmpty())) {
                anonymousClass1.layoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
            return;
        }
        HttpGetTask httpGetTask = new HttpGetTask(new ProfileActivity$6$$ExternalSyntheticLambda7(5, this, z));
        SearchEngine current = SearchEngine.getCurrent();
        if (current.autocomplete_url != null) {
            str2 = current.autocomplete_url + URLEncoder.encode(str);
        }
        this.lastTask = httpGetTask.execute(str2);
    }

    public void setOpenProgress(float f) {
        if (Math.abs(this.openProgress - f) > 1.0E-4f) {
            this.openProgress = f;
            int i = f <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i) {
                setImportantForAccessibility(i);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z) {
        BookmarksList bookmarksList = this.bookmarksList;
        boolean z2 = z && bookmarksList != null;
        this.opened = z2;
        if (z2) {
            bookmarksList.attach();
        }
    }
}
