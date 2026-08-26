package org.telegram.ui.web;

import android.content.Context;
import android.os.Bundle;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateBotAlert;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda14;

public final class BotWebViewContainer$$ExternalSyntheticLambda28 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final BotWebViewContainer f$0;
    public final String f$1;

    public BotWebViewContainer$$ExternalSyntheticLambda28(BotWebViewContainer botWebViewContainer, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = botWebViewContainer;
        this.f$1 = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i;
        MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet;
        String str = this.f$1;
        final BotWebViewContainer botWebViewContainer = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                botWebViewContainer.getClass();
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) TLKeyboardHelper.getType((TL_keyboard.KeyboardButton) obj, TL_keyboard.TL_buttonTypeRequestPeer.class);
                if (tL_buttonTypeRequestPeer == null) {
                    Theme.ResourcesProvider resourcesProvider = botWebViewContainer.resourcesProvider;
                    if (tL_error == null) {
                        new BulletinFactory(botWebViewContainer, resourcesProvider).showForError("UNKNOWN_BUTTON", false);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    } else {
                        new BulletinFactory(botWebViewContainer, resourcesProvider).showForError(false, tL_error);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    }
                } else {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                        Context context = botWebViewContainer.getContext();
                        int i2 = botWebViewContainer.currentAccount;
                        TLRPC.User user = botWebViewContainer.botUser;
                        ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33 = new ArticleViewer$$ExternalSyntheticLambda33(botWebViewContainer, str, tL_buttonTypeRequestPeer, 21);
                        Theme.ResourcesProvider resourcesProvider2 = botWebViewContainer.resourcesProvider;
                        CreateBotAlert.show(context, i2, user, (TLRPC.TL_requestPeerTypeCreateBot) requestPeerType, false, articleViewer$$ExternalSyntheticLambda33, resourcesProvider2, new BulletinFactory(botWebViewContainer, resourcesProvider2));
                    } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                        boolean[] zArr = new boolean[1];
                        Boolean bool = tL_requestPeerTypeUser.bot;
                        Boolean bool2 = tL_requestPeerTypeUser.premium;
                        BotWebViewContainer$$ExternalSyntheticLambda40 botWebViewContainer$$ExternalSyntheticLambda40 = new BotWebViewContainer$$ExternalSyntheticLambda40(botWebViewContainer, zArr, str, tL_buttonTypeRequestPeer);
                        MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet2 = MultiContactsSelectorBottomSheet.instance;
                        BaseFragment lastFragment = LaunchActivity.getLastFragment();
                        if (lastFragment == null) {
                            multiContactsSelectorBottomSheet = null;
                        } else {
                            multiContactsSelectorBottomSheet = MultiContactsSelectorBottomSheet.instance;
                            if (multiContactsSelectorBottomSheet == null) {
                                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet3 = new MultiContactsSelectorBottomSheet(lastFragment, i, bool, bool2, botWebViewContainer$$ExternalSyntheticLambda40);
                                multiContactsSelectorBottomSheet3.show();
                                MultiContactsSelectorBottomSheet.instance = multiContactsSelectorBottomSheet3;
                                multiContactsSelectorBottomSheet = multiContactsSelectorBottomSheet3;
                            }
                        }
                        if (multiContactsSelectorBottomSheet != null) {
                            multiContactsSelectorBottomSheet.setOnDismissListener(new BotLocation$$ExternalSyntheticLambda14(botWebViewContainer, zArr, str, 6));
                        }
                    } else {
                        Bundle bundleM = TelegramMediaSession$$ExternalSyntheticOutline0.m(15, "onlySelect", "dialogsType", true);
                        bundleM.putLong("requestPeerBotId", botWebViewContainer.botUser.id);
                        try {
                            SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                            tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                            bundleM.putByteArray("requestPeerType", serializedData.toByteArray());
                            serializedData.cleanup();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        final boolean[] zArr2 = new boolean[1];
                        DialogsActivity dialogsActivity = new DialogsActivity(bundleM) {
                            public final boolean[] val$sent;

                            public AnonymousClass7(Bundle bundleM2) {
                                super(bundleM2);
                                zArr = zArr2;
                            }

                            @Override
                            public final void onFragmentDestroy() {
                                JSONObject jSONObject;
                                super.onFragmentDestroy();
                                boolean[] zArr3 = zArr;
                                if (zArr3[0]) {
                                    return;
                                }
                                zArr3[0] = true;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                    jSONObject = null;
                                }
                                BotWebViewContainer.this.notifyEvent("requested_chat_failed", jSONObject);
                            }
                        };
                        dialogsActivity.delegate = new BotWebViewContainer$$ExternalSyntheticLambda40(botWebViewContainer, zArr2, str, tL_buttonTypeRequestPeer);
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                            bottomSheetParams.transitionFromLeft = true;
                            safeLastFragment.showAsSheet(dialogsActivity, bottomSheetParams);
                            break;
                        }
                    }
                }
                break;
            case 1:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates == null) {
                    Theme.ResourcesProvider resourcesProvider3 = botWebViewContainer.resourcesProvider;
                    if (tL_error2 == null) {
                        new BulletinFactory(botWebViewContainer, resourcesProvider3).showForError("UNKNOWN_BUTTON", false);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    } else {
                        new BulletinFactory(botWebViewContainer, resourcesProvider3).showForError(false, tL_error2);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    }
                } else {
                    MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates, false);
                    botWebViewContainer.notifyEvent("requested_chat_sent", BotWebViewContainer.obj(str, "req_id"));
                }
                break;
            default:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (updates2 == null) {
                    Theme.ResourcesProvider resourcesProvider4 = botWebViewContainer.resourcesProvider;
                    if (tL_error3 == null) {
                        new BulletinFactory(botWebViewContainer, resourcesProvider4).showForError("UNKNOWN_BUTTON", false);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    } else {
                        new BulletinFactory(botWebViewContainer, resourcesProvider4).showForError(false, tL_error3);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    }
                } else {
                    MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates2, false);
                    botWebViewContainer.notifyEvent("requested_chat_sent", BotWebViewContainer.obj(str, "req_id"));
                }
                break;
        }
    }
}
