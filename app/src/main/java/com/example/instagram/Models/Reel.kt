package com.example.instagram.Models

class Reel {
    var reelUrl:String=""
    var caption:String=""
    var profileLink:String?=null
    constructor()
    constructor(reelUrl: String, caption: String, profileLink: String) {
        this.reelUrl = reelUrl
        this.caption = caption
        this.profileLink=profileLink
    }
}