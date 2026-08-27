package pf;

import org.telegram.messenger.R;

public enum w {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);


    public final int f45958a;

    public final int f45959b;

    public final int f45960c;

    w(int i10, int i11, int i12) {
        this.f45958a = i10;
        this.f45959b = i11;
        this.f45960c = i12;
    }
}
