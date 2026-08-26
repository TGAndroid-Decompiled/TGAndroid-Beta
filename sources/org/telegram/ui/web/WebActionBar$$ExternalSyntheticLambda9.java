package org.telegram.ui.web;

import android.app.Activity;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.poll.attached.PollAttachedMediaLocation;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.LoginActivity$LoginPayView$$ExternalSyntheticLambda4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SettingsActivity$$ExternalSyntheticLambda21;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class WebActionBar$$ExternalSyntheticLambda9 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final Object f$0;

    public WebActionBar$$ExternalSyntheticLambda9(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return new RichTableCell$$ExternalSyntheticLambda3(22, (ArticleViewer.AnonymousClass15) this.f$0, (Integer) obj);
            case 1:
                MessageObject messageObject = (MessageObject) obj;
                ((ChatAttachAlertAudioLayout) this.f$0).playingAudio = messageObject;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(MediaController$$ExternalSyntheticOutline1.m(messageObject), messageObject, 0L));
            case 2:
                View view = (View) obj;
                PollAttachedMediaLocation pollAttachedMediaLocation = (PollAttachedMediaLocation) this.f$0;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, Theme.key_chat_outLocationIcon, (Theme.currentTheme.isDark() ? 3 : 6) * 0.12f);
                svgThumb.setAspectCenter(true);
                svgThumb.setColorKey(Theme.key_chat_inLocationIcon);
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(pollAttachedMediaLocation.media.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, new ClipRoundedDrawable(svgThumb), (Object) null, 0);
                view.addOnAttachStateChangeListener(new TextCell.AnonymousClass1(imageReceiver, 1));
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
                return new CanvasButton.AnonymousClass2(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate());
            case 3:
                final LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                if (((Integer) obj).intValue() == 2) {
                    final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(lPhotoPaintView.getContext(), new ChatActivity() {
                        public AnonymousClass15() {
                        }

                        @Override
                        public final TLRPC.User getCurrentUser() {
                            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
                        }

                        @Override
                        public final long getDialogId() {
                            return 0L;
                        }

                        @Override
                        public final Activity getParentActivity() {
                            return AndroidUtilities.findActivity(LPhotoPaintView.this.getContext());
                        }

                        @Override
                        public final Theme.ResourcesProvider getResourceProvider() {
                            return LPhotoPaintView.this.resourcesProvider;
                        }

                        @Override
                        public final boolean isKeyboardVisible() {
                            return false;
                        }

                        @Override
                        public final boolean isLightStatusBar() {
                            return false;
                        }
                    }, false, false, false, lPhotoPaintView.resourcesProvider);
                    chatAttachAlert.drawNavigationBar = true;
                    chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.AddImage));
                    chatAttachAlert.delegate = new ChatAttachAlert.ChatAttachViewDelegate() {
                        public final ChatAttachAlert val$chatAttachAlert;

                        public AnonymousClass16() {
                            chatAttachAlert = chatAttachAlert;
                        }

                        @Override
                        public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                            ChatAttachAlert chatAttachAlert2 = chatAttachAlert;
                            try {
                                HashMap<Object, Object> selectedPhotos = chatAttachAlert2.photoLayout.getSelectedPhotos();
                                if (selectedPhotos.isEmpty()) {
                                    return;
                                }
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                                String str = photoEntry.imagePath;
                                if (str == null) {
                                    str = photoEntry.path;
                                }
                                LPhotoPaintView lPhotoPaintView2 = LPhotoPaintView.this;
                                lPhotoPaintView2.appearAnimation(lPhotoPaintView2.createPhoto(str, true));
                                chatAttachAlert2.lambda$showGiftOfferSheet$15();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }

                        @Override
                        public final void didSelectBot(TLRPC.User user) {
                        }

                        @Override
                        public final void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
                            chatAttachAlert$$ExternalSyntheticLambda7.run();
                        }

                        @Override
                        public final boolean needEnterComment() {
                            return false;
                        }

                        @Override
                        public final void onCameraOpened() {
                        }

                        @Override
                        public final void onWallpaperSelected(Object obj2) {
                        }

                        @Override
                        public final void openAvatarsSearch() {
                        }

                        @Override
                        public final boolean selectItemOnClicking() {
                            System.currentTimeMillis();
                            return true;
                        }

                        @Override
                        public final void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
                        }
                    };
                    chatAttachAlert.setOnDismissListener(new SettingsActivity$$ExternalSyntheticLambda21(4));
                    chatAttachAlert.setMaxSelectedPhotos(1, false);
                    chatAttachAlert.init();
                    MediaController.forceBroadcastNewPhotos = true;
                    chatAttachAlert.photoLayout.loadGalleryPhotos();
                    chatAttachAlert.show();
                }
                return Boolean.TRUE;
            case 4:
                HeaderCell headerCell = (HeaderCell) this.f$0;
                headerCell.getClass();
                int iIntValue = ((Integer) obj).intValue();
                Paint[] paintArr = headerCell.paints;
                return paintArr[iIntValue % paintArr.length];
            case 5:
                int i = ((SparseIntArray) this.f$0).get(((Integer) obj).intValue(), -1);
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == 1);
            case 6:
                View view2 = (View) obj;
                UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) this.f$0;
                universalRecyclerView.getClass();
                return view2.getParent() != universalRecyclerView ? Boolean.FALSE : Boolean.valueOf(!UniversalAdapter.isShadow(universalRecyclerView.getChildViewHolder(view2).mItemViewType));
            case 7:
                View view3 = (View) obj;
                GradientHeaderActivity gradientHeaderActivity = (GradientHeaderActivity) this.f$0;
                gradientHeaderActivity.getClass();
                ViewParent parent = view3.getParent();
                RecyclerListView recyclerListView = gradientHeaderActivity.listView;
                return parent != recyclerListView ? Boolean.FALSE : Boolean.valueOf(!UniversalAdapter.isShadow(recyclerListView.getChildViewHolder(view3).mItemViewType));
            case 8:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
                loginPayView.getClass();
                if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    return Boolean.FALSE;
                }
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(loginPayView, 2));
                return Boolean.TRUE;
            case 9:
                URLSpan uRLSpan = (URLSpan) obj;
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                if (uRLSpan == null) {
                    return Boolean.FALSE;
                }
                profileActivity.openUrl(uRLSpan.getURL(), null);
                return Boolean.TRUE;
            case 10:
                StarsIntroActivity.AnonymousClass4 anonymousClass4 = (StarsIntroActivity.AnonymousClass4) this.f$0;
                return anonymousClass4.paints[((Integer) obj).intValue() % anonymousClass4.paints.length];
            case 11:
                MessageObject messageObject2 = (MessageObject) obj;
                ((SelectAudioAlert) this.f$0).playingAudio = messageObject2;
                return Boolean.valueOf(MediaController.getInstance().setPlaylist(MediaController$$ExternalSyntheticOutline1.m(messageObject2), messageObject2, 0L));
            default:
                TONIntroActivity.AnonymousClass4 anonymousClass5 = (TONIntroActivity.AnonymousClass4) this.f$0;
                return anonymousClass5.paints[((Integer) obj).intValue() % anonymousClass5.paints.length];
        }
    }
}
