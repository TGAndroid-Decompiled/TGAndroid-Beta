package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47642a;
    public final long f47643b;
    public final List f47644c;

    public d(long j3, long j10, List list) {
        this.f47642a = j3;
        this.f47643b = j10;
        this.f47644c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47642a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.s(sb2, this.f47643b, " }");
    }
}
