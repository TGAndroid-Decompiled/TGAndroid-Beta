package qh;

import org.telegram.messenger.R;
public enum a {
    CONTACTS(R.raw.tab_contacts),
    NEWS(R.raw.tab_news),
    CALLS(R.raw.tab_calls),
    CHATS(R.raw.tab_chats),
    SETTINGS(R.raw.tab_settings),
    f47047s("CHECKLIST", R.raw.tab_checklist_reverse),
    v("COLORS", R.raw.tab_colors_reverse),
    f47048w("FILES", R.raw.tab_files_reverse),
    f47049x("GALLERY", R.raw.tab_gallery_reverse),
    EF9("GIFT", R.raw.tab_gift_reverse),
    f47050y("LOCATION", R.raw.tab_location_reverse),
    E("STICKER", R.raw.tab_sticker_reverse),
    F("EMOJI", R.raw.tab_emoji_reverse),
    G("MODELS", R.raw.tab_models_reverse),
    H("MUSIC", R.raw.tab_music_reverse),
    I("POLL", R.raw.tab_poll_reverse),
    J("SYMBOLS", R.raw.tab_symbols_reverse),
    K("REPLIES", R.raw.tab_reply_reverse),
    EF1("WALLET", R.raw.tab_wallet_reverse),
    L,
    M("ARTICLE", R.raw.tab_article_reverse),
    N("GRAM", R.raw.gram_reverse),
    BOOSTS(R.raw.boosts, 25, 49),
    MONETIZATION(R.raw.monetize, 19, 45),
    STORIES_SAVED(R.raw.msg_stories_saved, 20, 40),
    STORIES_ARCHIVE(R.raw.msg_stories_archive);
    
    public final int f47051a;
    public final int f47052b;
    public final int f47053c;
    public final int d;
    public final int e;

    a(int i10, int i11, int i12) {
        this.f47051a = i10;
        this.f47052b = i10;
        this.d = i11;
        this.e = i12;
        this.f47053c = -1;
    }

    a(int i10) {
        this.f47053c = i10;
        this.f47051a = -1;
        this.f47052b = -1;
        this.d = -1;
        this.e = -1;
    }

    a(int i10) {
        this.f47051a = i10;
        this.f47052b = i10;
        this.d = -1;
        this.e = -1;
        this.f47053c = -1;
    }

    a(String str, int i10) {
        this.f47051a = r2;
        this.f47052b = i10;
        this.d = -1;
        this.e = -1;
        this.f47053c = -1;
    }
}
